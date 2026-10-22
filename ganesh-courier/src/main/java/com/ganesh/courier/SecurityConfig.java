package com.ganesh.courier;
import org.springframework.context.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {
  @Bean SecurityFilterChain chain(HttpSecurity http) throws Exception {
    http.csrf(c -> c.disable())
        .headers(h -> h.frameOptions(f -> f.sameOrigin()))
        .authorizeHttpRequests(a -> a.requestMatchers("/login.html", "/css/**").permitAll().anyRequest().authenticated())
        .formLogin(f -> f.loginPage("/login.html").loginProcessingUrl("/login")
            .defaultSuccessUrl("/index.html", true).failureUrl("/login.html?error"))
        .logout(l -> l.logoutUrl("/logout").logoutSuccessUrl("/login.html"));
    return http.build();
  }
  @Bean PasswordEncoder encoder() { return PasswordEncoderFactories.createDelegatingPasswordEncoder(); }
  @Bean UserDetailsService users(EmployeeRepo repo) {
    return u -> repo.findByUsername(u)
        .map(e -> User.withUsername(e.username).password(e.password).roles("EMPLOYEE").build())
        .orElseThrow(() -> new UsernameNotFoundException(u));
  }
}

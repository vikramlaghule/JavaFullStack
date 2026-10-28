package app.schoolApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class Mysecurity {

    @Bean
    SecurityFilterChain mysecuity2(HttpSecurity security)
	{
	return	security.csrf(s->{s.disable();}).authorizeHttpRequests(i->{
			i.requestMatchers(HttpMethod.POST).permitAll().
			anyRequest().authenticated();
		}).httpBasic(i->{}).build();
	}
	
    @Bean
	UserDetailsService user()
	{
		UserDetails user = User.builder().username("Vikram").password("{noop}Vikram@123").build();
		
		 return new InMemoryUserDetailsManager(user);
		
	}
    
 
	
}

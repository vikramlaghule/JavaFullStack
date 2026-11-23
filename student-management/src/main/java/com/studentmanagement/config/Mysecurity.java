package com.studentmanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.studentmanagement.entity.User;
import com.studentmanagement.repository.UserRepo;

@EnableWebSecurity
@Configuration
public class Mysecurity {
	@Autowired
	private UserRepo repo;

	private PasswordEncoder encoder;
	private MyUserDetailService myUserDetailService;
	public Mysecurity(MyUserDetailService myUserDetailService,PasswordEncoder passwordEncoder)
	{
		this.myUserDetailService=myUserDetailService;
		this.encoder=passwordEncoder;

	}

	 @Bean
	    SecurityFilterChain mysecuity2(HttpSecurity security)
		{
		return	security.csrf(s->{s.disable();}).authorizeHttpRequests(i->{
				i.requestMatchers(HttpMethod.POST).permitAll().
				anyRequest().authenticated();
			}).httpBasic(i->{}).build();
		} 
	
	
	 
	 @Bean
	 AuthenticationProvider provider()
	 {
		 DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(myUserDetailService);

		 authProvider.setPasswordEncoder(encoder);
		return null;
		 
		 
	 }
	
	
}

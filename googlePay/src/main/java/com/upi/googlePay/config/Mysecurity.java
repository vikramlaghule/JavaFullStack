package com.upi.googlePay.config;

import java.beans.BeanProperty;
import java.beans.Customizer;

import org.springdoc.core.properties.SwaggerUiConfigProperties.Csrf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class Mysecurity {

	@Bean
	 SecurityFilterChain custom_security(HttpSecurity http)
	{
	return	http.csrf(s->{
			s.disable();
		}).authorizeHttpRequests(s->{
			s.requestMatchers(HttpMethod.POST).permitAll();
		}).build();
		
	}
}

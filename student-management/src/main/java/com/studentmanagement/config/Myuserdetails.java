package com.studentmanagement.config;

import java.util.Collection;


import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.studentmanagement.entity.User;

public class Myuserdetails implements UserDetails {
	
	private User user;

	public Myuserdetails(User user)
	{
		this.user=user;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
	 return user.getRole().stream().map(s->{
		return new SimpleGrantedAuthority("ROLE_"+s);
	 }).toList();
	}

	@Override
	public @Nullable String getPassword() {
		
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		
		return user.getUsername();
	}


}

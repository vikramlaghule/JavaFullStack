package com.studentmanagement.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.studentmanagement.entity.User;
import com.studentmanagement.repository.UserRepo;

@Service
public class MyUserDetailService implements UserDetailsService {
	
	private UserRepo repo;
	
	public MyUserDetailService(UserRepo repo)
	{
		this.repo=repo;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
						
	User user=	repo.findByUsername(username)
		.orElseThrow(() ->
        new UsernameNotFoundException("User not found")
    );
						
		return new Myuserdetails(user);
	}

}

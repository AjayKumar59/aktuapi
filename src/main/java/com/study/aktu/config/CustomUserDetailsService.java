package com.study.aktu.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.study.aktu.model.User;
import com.study.aktu.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
			
		User existingUser = userRepository.findByEmail(email).orElseThrow(() -> 
				new UsernameNotFoundException("User not found"));
		
		return new org.springframework.security.core.userdetails.User(
				existingUser.getEmail(), existingUser.getPassword(), new ArrayList<>());
	}

}

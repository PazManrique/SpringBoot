package com.pazCode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.pazCode.repo.IUserRepo;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private IUserRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;


	
@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	com.pazCode.model.User us = repo.findByName(username);
		
		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("admin"));
	UserDetails userDetail = new User(us.getName(), us.getPassword(), roles);
		return userDetail;
	}

}

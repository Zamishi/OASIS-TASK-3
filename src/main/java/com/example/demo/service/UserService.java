package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User findbyUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	public void save(User user) {
		userRepository.save(user);
	}
}

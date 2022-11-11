package com.dailycoding.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycoding.models.User;
import com.dailycoding.respository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User addUser(User user)
	{
		return userRepository.save(user);
	}
	
	public Optional<User> getUserById(Long id)
	{
		return userRepository.findById(id);
	}
	
	public List<User> getAllUser()
	{
		return userRepository.findAll();
	}
}

package com.dailycoding.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycoding.models.User;
import com.dailycoding.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public User AddNewUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> findUserById(@PathVariable("id") Long id)
	{
		return userService.getUserById(id);
	}
	
	@GetMapping("/users")
	public List<User> getAllUser()
	{
		return userService.getAllUser();
	}
}

package com.baciu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baciu.entity.User;
import com.baciu.repository.UserRepository;
import com.baciu.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("users/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getById(id);
	}
	
	@PostMapping("users")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("users")
	public void updateUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable int id) {
		userRepository.delete(id);
	}
	
}

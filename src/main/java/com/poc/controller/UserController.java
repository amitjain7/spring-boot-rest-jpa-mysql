package com.poc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.model.User;
import com.poc.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUser/hardcodded")
	public List<User> getAllUserHardCodded() {
		
		User user=new User();
		user.setUserName("Amit");
		user.setUserAddress("Jhansi");
		
		List<User> l=new ArrayList<>();
		l.add(user);
		
		return l;
		
		
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser() {
		
		return userService.getUserList();
		
	}
	
	@GetMapping("/getUserById/{userId}")
	public Optional<User> getUserById(@PathVariable("userId") Long id) {
		
		return userService.getUserById(id);
		
	}
	
	@GetMapping("/getUserByName/{userName}")
	public List<User> getUserByName(@PathVariable("userName") String userName) {
		
		return userService.findByUserName(userName);
		
	}
	
	
	@PostMapping("/saveUser")
	public void saveUser(@RequestBody User user) {
		userService.saveUser(user);
		
	}
	
}

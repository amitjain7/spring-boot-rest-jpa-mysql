package com.poc.service;

import java.util.List;
import java.util.Optional;

import com.poc.model.User;

public interface UserService {
	public List<User> getUserList();
	public List<User> getUserListByName();
	
	public void saveUser(User user);
	
	
	public Optional<User> getUserById(Long userId);
	
	public List<User> findByUserName(String userName);
	
}

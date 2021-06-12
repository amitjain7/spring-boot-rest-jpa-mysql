package com.poc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.model.User;
import com.poc.repository.UserRepository;
import com.poc.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getUserList() {
		return userRepository.findAll();
		
	}

	@Override
	public List<User> getUserListByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		
		return userRepository.findById(userId);
		
	
	}
	@Override
	public List<User> findByUserName(String userName){
		return userRepository.findByUserNameCustomQuery(userName);
	}

}

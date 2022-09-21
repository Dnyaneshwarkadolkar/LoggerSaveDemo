package com.demo.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.dao.UserRepository;
import com.demo.test.model.User;
@Service
public class UserServiceImpl implements UserService{
@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		return	userRepository.save(user);
	
	}

}

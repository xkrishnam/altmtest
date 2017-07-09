package com.altm.test.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altm.test.model.User;
import com.altm.test.repository.UserRepository;
/*
 * Provides services related to user entity
 * */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;
	
	@Transactional
	@Override
	public User addUser(User user){
		return this.repo.save(user);
	}

	@Override
	public List<User> getAll(){
		return this.repo.findAll();
	}
	
	
}

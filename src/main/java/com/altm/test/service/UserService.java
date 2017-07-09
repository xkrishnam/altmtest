package com.altm.test.service;

import java.util.List;

import com.altm.test.model.User;

public interface UserService {
	public User addUser(User user);
	public List<User> getAll();
}

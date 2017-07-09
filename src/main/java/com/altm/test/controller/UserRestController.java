package com.altm.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altm.test.model.User;
import com.altm.test.service.UserService;


/*
 * Controller for exposing rest end points used for managing user entity
 * */

@RestController("/api/user")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	/*
	 * Rest Endpoint for user creation.
	 * */
	@RequestMapping(method=RequestMethod.POST,consumes="application/json")
	public User addUser(@RequestBody User user){
		return this.userService.addUser(user);		
	}
	
	/*
	 * Rest endpoint to fetch all saved users
	 * 
	 * */
	@RequestMapping(method=RequestMethod.GET,consumes="application/json")
	public List<User> getAllUsers(){
		return this.userService.getAll();		
	}
}

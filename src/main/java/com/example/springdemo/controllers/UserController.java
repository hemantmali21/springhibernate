package com.example.springdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.User;
import com.example.springdemo.services.UserService;

@RestController
@RequestMapping(value="api/")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="users",method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="users",method=RequestMethod.POST)
	public void createUser(@RequestBody User user){
		  userService.addUser(user);
	}
	
	@RequestMapping(value="users/{id}",method=RequestMethod.GET)
	public User getUserInfo(@PathVariable int id){
		return userService.getUser(id);
		
	}
	
	@RequestMapping(value="users/{id}",method=RequestMethod.PUT)
	public void updateUser(@PathVariable int id,@RequestBody User user){
		 userService.updateUser(user);
	}

	@RequestMapping(value="users/{id}",method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable int id){
		  userService.deleteUser(id);
	}
}

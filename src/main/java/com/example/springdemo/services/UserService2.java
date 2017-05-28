/*package com.example.springdemo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springdemo.model.User;
import com.example.springdemo.repository.UserRepository;

@Service
public class UserService2 {
	
	@Autowired
	private UserRepository userRepository;

	 List<User> users =  Arrays.asList(
			 new User(1, "Hemant", "Mumbai"),
			 new User(2,"Sachin","Mumbai"));
	 
	@Transactional	 
	 public List<User> getAllUsers(){
		 List<User> users = new ArrayList<>();
		 userRepository.findAll().forEach(users::add);
		 return users;

	}

	@Transactional
	public void addUser(User user){
		userRepository.save(user);
	} 
	
	@Transactional
	public User getUser(int id){
		return userRepository.findOne(id);
	}
	
	@Transactional
	public void updateUser(int id,User user){
		User userUpdate = userRepository.findOne(id);
		BeanUtils.copyProperties(user, userUpdate);
		userRepository.save(userUpdate);
		
	}
	
	@Transactional
	public void deleteUser(int id){
		userRepository.delete(id);
	}
	
}
*/
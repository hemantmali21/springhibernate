package com.example.springdemo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.User;
import com.example.springdemo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	/*
	 * List<User> users = Arrays.asList( new User(1, "Hemant", "Mumbai"), new
	 * User(2,"Sachin","Mumbai"));
	 */

	@Transactional
	public List<User> getAllUsers() {
		/*
		 * List<User> users = new ArrayList<>();
		 * userRepository.findAll().forEach(users::add); return users;
		 */
		return userRepository.getAllUsers();
	}

	@Transactional
	public void addUser(User user) {
		userRepository.addUser(user);
		;
	}

	@Transactional
	public void deleteUser(Integer userId) {
		userRepository.deleteUser(userId);
	}

	@Transactional
	public User getUser(int userid) {
		return userRepository.getUser(userid);
	}

	@Transactional
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.updateUser(user);
	}

	@Transactional
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	

}

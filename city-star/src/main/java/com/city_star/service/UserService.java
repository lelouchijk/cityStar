package com.city_star.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.city_star.model.User;
import com.city_star.repository.UserRepository;

@Service
public class UserService {
	
	
	private final UserRepository userRepo;
	
	@Autowired
	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	public void saveUser(User user) {
		userRepo.save(user);
	}
	
	public void updateUser(long id, User user) {
		user.setUserId(id);
		userRepo.save(user);
	}
	
	public void deleteUser(long id) {
		
	}
	
	
}

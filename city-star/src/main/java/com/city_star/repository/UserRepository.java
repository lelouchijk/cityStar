package com.city_star.repository;

import java.util.List;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.city_star.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findByUser(String user);
	List<User> findByName(String Name);
	List<User> findByEmail(String email);
	List<User> findByRole(Role role);
	
	List<User> findByphoneNumber(String phoneNumber);
	
	
	
}

package com.city_star.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.city_star.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	List<Doctor> findBySpecialty(String specialty);
	
}

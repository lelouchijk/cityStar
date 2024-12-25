package com.city_star.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.city_star.repository.DoctorRepository;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepo;

	@Autowired
	public DoctorService(DoctorRepository doctorRepo) {
		super();
		this.doctorRepo = doctorRepo;
	}

    
	
}

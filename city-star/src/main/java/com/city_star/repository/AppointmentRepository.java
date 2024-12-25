package com.city_star.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.city_star.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {


    
}

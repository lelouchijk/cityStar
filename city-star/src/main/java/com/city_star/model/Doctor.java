package com.city_star.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long doctorId;
	
	private String doctorName;
	private String specialty;
	private int consultation_fee;
	private String hospital_address;
	
	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Doctor(long doctorId, String doctorName, String specialty, int consultation_fee, String hospital_address) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialty = specialty;
		this.consultation_fee = consultation_fee;
		this.hospital_address = hospital_address;
	}




	public long getDoctorId() {
		return doctorId;
	}




	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}




	public String getDoctorName() {
		return doctorName;
	}




	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}




	public String getSpecialty() {
		return specialty;
	}




	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}




	public int getConsultation_fee() {
		return consultation_fee;
	}




	public void setConsultation_fee(int consultation_fee) {
		this.consultation_fee = consultation_fee;
	}




	public String getHospital_address() {
		return hospital_address;
	}




	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}
	
	
	
	
	
	
	

}
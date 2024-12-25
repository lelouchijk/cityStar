package com.city_star.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long appointmentId;

    private Date appointmentDate;

    @Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private String status;



    public Appointment() {
        super();
    }


    public Appointment(long appointmentId, Date appointmentDate, String status) {
        super();
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }


    public long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
    
}

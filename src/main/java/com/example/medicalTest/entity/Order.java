package com.example.medicalTest.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Data
@Table(name="orderdetails")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int order_id;
	
	@NotNull(message="enter the testName")
	private String test_name;
	
	

	
	@NotNull(message="enter the orderDate")
	private Date order_date;
	

	
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient pa ;
	
	
	
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] image;
	

	public Patient getPatient() {
        return pa;
    }

    public void setPatient(Patient patient) {
        this.pa = patient;
    }

	
	
	
	
}

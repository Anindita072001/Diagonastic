package com.example.medicalTest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patient_id;
	@NotNull(message="enter the name")
	private String patient_name;
	@NotNull(message="enter the gender")
	private String gender;
	@NotNull(message="enter the age")
	private int age;
	@NotNull(message="enter the phoneNo")
	private Long phone_no;
	@NotNull(message="enter the emailId")
	private String emailId;
	@NotNull(message="enter the address")
	private String address;
	@NotNull(message="enter the password")
	private String password;
	


	
}

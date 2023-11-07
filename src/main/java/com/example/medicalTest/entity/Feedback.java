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
@Table(name="feedback")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int f_id;
	
	@NotNull(message="enter full name")
	private String name;
	
	@NotNull(message="enter email id")
	private String emailId;
	
	@NotNull(message="enter phone number")
	private Long phoneNo;
	
	@NotNull(message="enter the message")
	private String message;
	
	
	
//	@ManyToOne(cascade=CascadeType.MERGE)
//	@JoinColumn(name="patient_id",referencedColumnName = "patient_id")
//	@NotNull(message="enter the patientid")
//	private Patient pa ;
//	
//	
//	@ManyToOne(cascade=CascadeType.MERGE)
//	@JoinColumn(name="order_id",referencedColumnName = "order_id")
//	@NotNull(message="enter the orderid")
//	private Order or ;
	
	
	
	

	
}	

package com.example.medicalTest.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	
	



	
	
	
	
}

package com.example.medicalTest.DTO;

import java.sql.Date;

import com.example.medicalTest.entity.Patient;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderDTO {

	
	
private int order_id;
	
	
	private String test_name;

	private Date order_date;

	private Patient pa ;

	private String byte64;
	
}

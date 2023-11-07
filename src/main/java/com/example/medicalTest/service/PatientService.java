package com.example.medicalTest.service;
import java.util.List;

import com.example.medicalTest.entity.Patient;


public interface PatientService {

	Patient addPatient(Patient test); // Insert
	List<Patient> fetchAllTest(); // select
	Patient getPatientById(int id); // select by id
	Patient upadtePatientById(int id, Patient test); // Update
	String deletePatientById(int id);

	Patient loginPatient(String email);
}

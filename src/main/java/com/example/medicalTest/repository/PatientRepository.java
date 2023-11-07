package com.example.medicalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicalTest.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

	Patient findByEmailId(String email);
}

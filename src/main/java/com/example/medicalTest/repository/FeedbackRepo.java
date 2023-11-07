package com.example.medicalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicalTest.entity.Feedback;
@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{

}

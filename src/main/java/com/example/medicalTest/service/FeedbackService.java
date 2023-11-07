package com.example.medicalTest.service;

import java.util.List;

import com.example.medicalTest.entity.Feedback;

public interface FeedbackService {
	Feedback addTestName(Feedback testname); // Insert
	List<Feedback> fetchAllTestName(); // select
	Feedback getTestNameById(int id); // select by id
	Feedback upadteTestNameById(int id, Feedback testname); // Update
	String deleteTestNameById(int id);
}

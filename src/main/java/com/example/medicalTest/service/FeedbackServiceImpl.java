package com.example.medicalTest.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalTest.entity.Feedback;
import com.example.medicalTest.repository.FeedbackRepo;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	FeedbackRepo tr;
	
	
	@Override
	public Feedback addTestName(Feedback testname) {
		return tr.save(testname);
	}

	@Override
	public List<Feedback> fetchAllTestName() {
		List<Feedback> allTestName = tr.findAll();
		return allTestName;
		
	}

	@Override
	public Feedback getTestNameById(int id) {
		Optional<Feedback> testname = tr.findById(id);

		if (testname.isPresent()) {

			return testname.get();
		}
		return null;
	}

	@Override
	public Feedback upadteTestNameById(int id, Feedback testname) {
		Optional<Feedback> t1 = tr.findById(id);
		
		if (t1.isPresent()) {
			
			Feedback originalTestName = t1.get();
			
			if (Objects.nonNull(testname.getMessage()) && !"".equalsIgnoreCase(testname.getMessage())) {
				 originalTestName.setMessage(testname.getMessage());
	           }
			
		
			
			 
		return tr.save(originalTestName);
	}
		return null;
	}

	@Override
	public String deleteTestNameById(int id) {
		if(tr.findById(id).isPresent()) {
			tr.deleteById(id);
			
			return "user deleted successfully";
		}
		return "No such user in the database";
	}
	}




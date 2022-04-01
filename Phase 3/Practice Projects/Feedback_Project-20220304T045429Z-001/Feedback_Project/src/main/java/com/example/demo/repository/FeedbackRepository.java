package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Feedback;


//@author Kavitha S

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

		
	
}

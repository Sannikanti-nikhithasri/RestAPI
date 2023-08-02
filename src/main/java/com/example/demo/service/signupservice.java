package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.models.signupmodels;
import com.example.demo.repository.signuprepository;

@Service

public class signupservice{
	@Autowired
	signuprepository sr;
	
	
	public signupmodels addusers(signupmodels s) {
		return sr.save(s);
	
	}
	public List<signupmodels>getall(){ 
		return sr.findAll();
	}
	
	
}

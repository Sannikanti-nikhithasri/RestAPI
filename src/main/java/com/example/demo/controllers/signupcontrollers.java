package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.signupmodels;
import com.example.demo.service.signupservice;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200/")
public class signupcontrollers {
	@Autowired
	signupservice sr;
	@PostMapping ("/insert")
	
	public signupmodels addusers (@RequestBody   signupmodels s) {
		return sr.addusers(s);
	}
	
	@GetMapping("/getall")
	public List<signupmodels> getall(){
		return sr.getall();
	}

}

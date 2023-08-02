package com.example.demo.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class signupmodels {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)	
	private int id;
	@Column(name="Username")
	private String username;
	private String email;
	private String password;
	

}

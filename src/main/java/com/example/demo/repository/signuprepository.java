package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.signupmodels;

import jakarta.persistence.Id;
@Repository

public interface signuprepository extends JpaRepository<signupmodels,Id> {

}

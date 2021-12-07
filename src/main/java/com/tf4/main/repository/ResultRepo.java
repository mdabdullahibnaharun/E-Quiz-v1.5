package com.tf4.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tf4.main.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}

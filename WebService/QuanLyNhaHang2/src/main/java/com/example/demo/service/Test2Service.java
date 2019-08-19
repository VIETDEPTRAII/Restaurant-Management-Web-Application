package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.test2;

public interface Test2Service extends JpaRepository<test2, Long> {
  //GET ALL 
	public default List<test2> GetAllTest2() {
		return this.findAll();
	}
}

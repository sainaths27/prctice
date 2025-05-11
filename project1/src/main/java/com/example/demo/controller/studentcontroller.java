package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import com.example.demo.service.studentservice;

@RestController
public class studentcontroller {
	
	@Autowired
	private  studentservice s;
	
	@PostMapping("/add")
	public student add(@RequestBody student student)
	{
	return s.add(student);
	
	
	}
	@GetMapping("/display")
	public List<student>display()
	{
	return s.display();
	}

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.student;
import com.example.demo.repository.studentrepository;
@Service

public class studentserivceimp implements studentservice {

	@Autowired
	private studentrepository sr;
	@Override
	public student add(student s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	@Override
	public List<student> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void update(student s, int id) {
		// TODO Auto-generated method stub
s.setId(id);
sr.save(s);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
sr.deleteById(id);
	}

}

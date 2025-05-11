

package com.example.demo.service;

import java.util.List;



import com.example.demo.model.student;


public interface studentservice {
	
	public student add(student s);
	public List<student>display();
	public void update(student s , int id);
	public void delete ( int id);
	
}

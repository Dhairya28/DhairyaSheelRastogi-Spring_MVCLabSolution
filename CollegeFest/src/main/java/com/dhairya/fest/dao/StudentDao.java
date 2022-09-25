package com.dhairya.fest.dao;

import java.util.List;

import com.dhairya.fest.model.Student;

public interface StudentDao {
	
	public void saveStudent(Student student);
	public Student findById(int id);
	public List<Student>findAll();
	public void deleteStudent(int id);
	
	

}

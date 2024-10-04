package com.yigitkaya.controller;

import java.util.List;

import com.yigitkaya.entities.Student;

public interface IStudentController {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer id);
}

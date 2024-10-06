package com.yigitkaya.controller;

import java.util.List;

import com.yigitkaya.dto.DtoStudent;
import com.yigitkaya.dto.DtoStudentIU;
import com.yigitkaya.entities.Student;

public interface IStudentController {

	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}

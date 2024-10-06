package com.yigitkaya.services;

import java.util.List;

import com.yigitkaya.dto.DtoStudent;
import com.yigitkaya.dto.DtoStudentIU;
import com.yigitkaya.entities.Student;

public interface IStudentService {

	public DtoStudent saveStudent(DtoStudentIU dtoStudent);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}

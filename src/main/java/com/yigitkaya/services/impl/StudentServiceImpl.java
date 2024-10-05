package com.yigitkaya.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yigitkaya.entities.Student;
import com.yigitkaya.repository.StudentRepository;
import com.yigitkaya.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList =  studentRepository.findAll();
		return studentList;
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> optional =  studentRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void deleteStudent(Integer id) {
		Student foundStudent = getStudentById(id);
		if(foundStudent!=null) {
			studentRepository.delete(foundStudent);
		}
			
		
	}


}

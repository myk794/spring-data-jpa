package com.yigitkaya.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yigitkaya.controller.IStudentController;
import com.yigitkaya.entities.Student;
import com.yigitkaya.services.IStudentService;

@RestController
@RequestMapping("rest/api/student")
public class StudentControllerImpl implements IStudentController {

	@Autowired
	private IStudentService studentService;
	
	@PostMapping(path="/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@GetMapping(path="/list")
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentService.getAllStudents();
	}

	@GetMapping(path="/list/{id}")
	@Override
	public Student getStudentById(@PathVariable(name = "id") Integer id) {
		// TODO Auto-generated method stub
		return studentService.getStudentById(id);
	}

	@DeleteMapping(path="/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name="id") Integer id) {
		studentService.deleteStudent(id);
		
	}

}

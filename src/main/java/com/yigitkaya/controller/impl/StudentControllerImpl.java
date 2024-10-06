package com.yigitkaya.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yigitkaya.controller.IStudentController;
import com.yigitkaya.dto.DtoStudent;
import com.yigitkaya.dto.DtoStudentIU;
import com.yigitkaya.entities.Student;
import com.yigitkaya.services.IStudentService;

@RestController
@RequestMapping("rest/api/student")
public class StudentControllerImpl implements IStudentController {

	@Autowired
	private IStudentService studentService;
	
	@PostMapping(path="/save")
	@Override
	public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
		return studentService.saveStudent(dtoStudentIU);
	}

	@GetMapping(path="/list")
	@Override
	public List<DtoStudent> getAllStudents() {
		// TODO Auto-generated method stub
		return studentService.getAllStudents();
	}

	@GetMapping(path="/list/{id}")
	@Override
	public DtoStudent getStudentById(@PathVariable(name = "id") Integer id) {
		// TODO Auto-generated method stub
		return studentService.getStudentById(id);
	}

	@DeleteMapping(path="/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name="id") Integer id) {
		studentService.deleteStudent(id);
		
	}

	@PutMapping(path="/update/{id}")
	@Override
	public DtoStudent updateStudent(@PathVariable(name="id") Integer id,@RequestBody DtoStudentIU dtoStudentIU) {
		// TODO Auto-generated method stub
		return studentService.updateStudent(id, dtoStudentIU);
	}

}

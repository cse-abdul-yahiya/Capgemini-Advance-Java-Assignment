/**
 * 
 */
package com.spring.RESt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.RESt.Service.StudentService;
import com.spring.RESt.model.Student;

/**
 * 
 */
@RestController
@RequestMapping("api/students")
public class StudentController {
	
	
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService=studentService;
		// TODO Auto-generated constructor stub
	}
	
//	@RequestMapping("/")
//	public String message() {
//		return "Welcome";
//	}
	
	@GetMapping()
	public List<Student> getStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Optional<Student> getStudentById(@PathVariable Long id){
		return studentService.getStudentById(id);
	}
	
	@PostMapping()
	public Student saveStudent(@RequestBody Student student) {
		return  studentService.createStudent(student);
	}
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
		return studentService.updateStudent(id,student);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}
	
	
	

}

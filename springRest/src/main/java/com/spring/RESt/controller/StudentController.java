/**
 * 
 */
package com.spring.RESt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	//normal return , developer has no control on it but spring automitacally send it like status  =200 ok
//	@GetMapping()
//	public List<Student> getStudents(){
//		return studentService.getAllStudents();
//	}
	
	@GetMapping()
	public ResponseEntity<List<Student>> getStudents(

	@RequestParam(required=false) String name,
	@RequestParam(required=false) String city){

	    if(name!=null && city!=null){
	        return ResponseEntity.ok(
	        studentService.findByNameAndCity(name,city));
	    }

	    return ResponseEntity.ok(
	    studentService.getAllStudents());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id){
		return ResponseEntity.ok(studentService.getStudentById(id));
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

/**
 * 
 */
package com.spring.RESt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.RESt.model.Student;
import com.spring.RESt.repository.StudentRepository;

/**
 * 
 */
@Service
public class StudentService {
	
	private StudentRepository studentRepository;

	/**
	 * @param studentRepository
	 */
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	 public List<Student> getAllStudents(){
		 return studentRepository.findAll();
		 
	 }
	 
	 public Student createStudent(Student student) {
		 return studentRepository.save(student);
	 }
	 public Optional<Student> getStudentById(Long id) {
		 return studentRepository.findById(id);
	 }
	 
	  // PUT (UPDATE)
	    public Student updateStudent(Long id, Student student) {

	        Student existingStudent =
	                studentRepository.findById(id).orElseThrow();

	        existingStudent.setName(student.getName());
	        existingStudent.setCity(student.getCity());

	        return studentRepository.save(existingStudent);
	    }

	    // DELETE
	    public void deleteStudent(Long id) {
	        studentRepository.deleteById(id);
	    }
	 
	 
	
	
	

}

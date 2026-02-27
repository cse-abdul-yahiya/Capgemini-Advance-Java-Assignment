/**
 * 
 */
package com.spring.RESt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.spring.RESt.model.Student;

/**
 * 
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
	
	

}

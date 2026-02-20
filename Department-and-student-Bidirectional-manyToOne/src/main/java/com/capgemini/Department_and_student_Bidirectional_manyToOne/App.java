package com.capgemini.Department_and_student_Bidirectional_manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        
      
        
       try {
    	   em.getTransaction().begin();
    	   Department department = new Department("CSE");
    	   Student s1 = new Student("Abdul",department);
    	   Student s2 = new Student("Supriya",department);
    	   Student s3 = new Student("Mohit",department);
    	   
    	   em.persist(s1);
    	   em.persist(s2);
    	   em.persist(s3);
    	   em.persist(department);
    	   
    	   em.getTransaction().commit();
    	   System.out.println("Data inserted succseessfullyyy");
    	   
       }catch(Exception e) {
    	   System.out.println(e.getMessage());
    	   e.printStackTrace();
       }finally {
    	   em.close();
    	   emf.close();
       }
    }
}

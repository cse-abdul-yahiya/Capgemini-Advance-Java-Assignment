package com.capgemini.Employee_and_Locker_Unidirectional_One_to_One_Mapping;

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
       
       em.getTransaction().begin();
       Locker loc = new Locker(2,5);
       
       Employee emp = new Employee("Abdul","Cse",loc);
       
       
       em.persist(emp);
       
       em.getTransaction().commit();
       
System.out.println("Employee and locker details saved successfully");
    }
}

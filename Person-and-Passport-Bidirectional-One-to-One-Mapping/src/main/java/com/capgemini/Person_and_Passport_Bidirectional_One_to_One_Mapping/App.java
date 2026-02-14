package com.capgemini.Person_and_Passport_Bidirectional_One_to_One_Mapping;

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
       
       Passport passport = new Passport("AWA1234R","25-04-2005","21-12-2030");
       Person person = new Person("Abdul","12-11-25",passport);
       
       person.setPassport(passport);
       passport.setPerson(person);
       em.persist(passport);
       em.getTransaction().commit();
   	System.out.println("Person and Passport details saved successfully");
    }
}

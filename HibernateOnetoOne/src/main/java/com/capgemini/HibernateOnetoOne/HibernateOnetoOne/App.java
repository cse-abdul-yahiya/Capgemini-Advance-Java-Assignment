package com.capgemini.HibernateOnetoOne.HibernateOnetoOne;

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
        //step 1 : create entityManagerFactory
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
    	
    	//step 2 : Create EntityManager
    	EntityManager em= emf.createEntityManager();
    	
    	//step 3 : Begin transaction
    	em.getTransaction().begin();
    	
    	//step 4 : create object
    	
    	Account account = new Account("ACC1234", "Saving");
    	Customer customer = new  Customer("John doe", account);
    	
    	//set biderectional relation
    	account.setCustomer(customer);
    	
    	//step5:persist customer(account will alsopersist if cascade is used)
    	
    	em.persist(customer);
    	
    	//step 6 : commit trancastion
    	em.getTransaction().commit();
    	System.out.println("Customer and Account saved successfully");
    	
    			;
    	
    }
}

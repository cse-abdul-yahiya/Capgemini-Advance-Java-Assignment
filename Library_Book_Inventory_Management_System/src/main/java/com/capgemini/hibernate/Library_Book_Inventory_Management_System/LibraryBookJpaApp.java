/**
 * 
 */
package com.capgemini.hibernate.Library_Book_Inventory_Management_System;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 */
public class LibraryBookJpaApp {
	
	public static void main(String[] args) {
		EntityManagerFactory emf =
		        Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		EntityManager em = emf.createEntityManager();
		
		try {
			 em.getTransaction().begin();
			 
			   Book b1 = new Book(1, "The Girl in Room Number 105", "Chetan Bhagat",
	                    "Thriller, Murder Mystery Novel", 550.0, "Available", 2018);

	            Book b2 = new Book(2, "Verity", "Collen Hoover",
	                    "Romance", 650.0, "Available", 2018);

	            Book b3 = new Book(3, "The Alchemist", "Paulo Coelho",
	                    "Fiction", 300.0, "Available", 1988);
	            
	            em.persist(b1);
	            em.persist(b2);
	            em.persist(b3);

	            em.getTransaction().commit();
	            
	            Book book = em.find(Book.class, 1);
	            System.out.println("\nBook with ID 1:");
	            System.out.println(book);

	            // ---------- READ ALL ----------
	            System.out.println("\nAll Books:");
	            List<Book> books = em.createQuery("SELECT b FROM Book b", Book.class)
	                            .getResultList();

	            books.forEach(System.out::println);

	            em.getTransaction().begin();

	            Book updateBook = em.find(Book.class, 2);
	            if (updateBook != null) {
	                updateBook.setPrice(700.0);
	                updateBook.setAvailabilityStatus("Issued");
	            }

	            em.getTransaction().commit();

	            System.out.println("\nAfter Update:");
	            System.out.println(em.find(Book.class, 2));
	            em.getTransaction().begin();

	            Book deleteBook = em.find(Book.class, 3);
	            if (deleteBook != null) {
	                em.remove(deleteBook);
	            }

	            em.getTransaction().commit();

	            System.out.println("\nAfter Deletion:");
	            List<Book> finalList =
	                    em.createQuery("SELECT b FROM Book b", Book.class)
	                            .getResultList();

	            finalList.forEach(System.out::println);

	        } finally {
	            em.close();
	            emf.close();
	        }
	    }
	}





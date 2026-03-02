/**
 * 
 */
package com.spring.REST.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.REST.Entity.Book;

/**
 * 
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	List<Book> findByAuthor(String author);
	List<Book> findByGenre(String genre);
	
	List<Book> findByPriceLessThan(Double price);
	
	List<Book> findByPriceGreaterThan(Double price);
	
	List<Book> findByPublishedDateAfter(LocalDate date);
	
	List<Book> findByPublishedDateBefore(LocalDate date);
	
	List<Book> findByTitleContaining(String keyword);
	
	List<Book> findByTitleStartingWith(String prefix);
	
	List<Book> findByTitleEndingWith(String suffix);
	
	List<Book> findByGenreAndAuthor(String genre, String author);
	
	List<Book> findByGenreOrAuthor(String genre, String author);
	
	List<Book> findByPriceBetween(Double minPrice, Double maxPrice);
	
	List<Book> findByGenreAndPriceLessThan(String genre, Double price);
	List<Book> findByOrderByPublishedDateDesc();
	
	List<Book> findByOrderByPriceAsc();
	
	
	 
	
	
	

}

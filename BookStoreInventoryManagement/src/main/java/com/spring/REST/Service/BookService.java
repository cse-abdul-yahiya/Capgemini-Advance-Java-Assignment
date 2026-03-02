/**
 * 
 */
package com.spring.REST.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.REST.Entity.Book;
import com.spring.REST.Repository.BookRepository;

/**
 * 
 */
@Service
public class BookService {
	
	private BookRepository repo ;
	
	public BookService(BookRepository repo) {
		this.repo=repo;
	}
	
	public List<Book> getAllBooks(){

	    return repo.findAll();

	}
	
	public List<Book> getByAuthor(String author){
		return repo.findByAuthor(author);
	}
	
	
	public List<Book> getByGenre(String genre){
		return repo.findByGenre(genre);
	}
	
	public List<Book> cheaperThan(Double price){
		return repo.findByPriceLessThan(price);
	}

	public List<Book> expensiveThan(Double price){
		return repo.findByPriceGreaterThan(price);
	}

	public List<Book> newArrivals(LocalDate date){
		return repo.findByPublishedDateAfter(date);
	}

	public List<Book> searchTitle(String keyword){
		return repo.findByTitleContaining(keyword);
	}

	public List<Book> genreAndAuthor(String genre,String author){
		return repo.findByGenreAndAuthor(genre,author);
	}

	public List<Book> genreOrAuthor(String genre,String author){
		return repo.findByGenreOrAuthor(genre,author);
		}

	public List<Book> priceRange(Double min,Double max){

		return repo.findByPriceBetween(min,max);
	}

	public List<Book> genreDiscount(String genre,Double price){

		return repo.findByGenreAndPriceLessThan(genre,price);
	}
	
	public Page<Book> latestBooks(int page,int size){
		Pageable pageable=PageRequest.of(page,size,Sort.by("publishedDate").descending());
		return repo.findAll(pageable);
		
	}

	public Page<Book> booksByPrice(int page,int size){
		Pageable pageable=PageRequest.of(page,size,Sort.by("price").ascending());
		return repo.findAll(pageable);
	}
	
	public Book saveBook(Book book){

		return repo.save(book);

		}
	
	
	

}

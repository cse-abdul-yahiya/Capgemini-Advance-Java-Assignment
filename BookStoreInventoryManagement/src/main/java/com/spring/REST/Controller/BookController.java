/**
 * 
 */
package com.spring.REST.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.REST.Entity.Book;
import com.spring.REST.Service.BookService;

/**
 * 
 */@RestController
 @RequestMapping("/api/books")
public class BookController {
	private BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService=bookService;
	}
	
	@GetMapping()
	public ResponseEntity<List<Book>> getAllBooks(){

	    return ResponseEntity.ok(
	    bookService.getAllBooks());

	}
	
	@GetMapping("/author")
	public ResponseEntity<List<Book>> byAuthor(@RequestParam String author){
		return ResponseEntity.ok(bookService.getByAuthor(author));
	}
	
	@GetMapping("/genre")
	public ResponseEntity<List<Book>> byGenre(@RequestParam String genre){
		return ResponseEntity.ok(bookService.getByGenre(genre));
	}
	
	@GetMapping("/cheaper")
	public ResponseEntity<List<Book>> cheaper(@RequestParam Double maxPrice){
		return ResponseEntity.ok(bookService.cheaperThan(maxPrice));
		
		
	}
	
	
	@GetMapping("/expensive")
	public ResponseEntity<List<Book>> expensive(@RequestParam Double minPrice){
		return ResponseEntity.ok(bookService.expensiveThan(minPrice));
		
	}
	
	@GetMapping("/new-arrivals")
	public ResponseEntity<List<Book>> newArrivals(@RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)LocalDate publishedAfter){

		return ResponseEntity.ok(bookService.newArrivals(publishedAfter));
			}
	
	
	@GetMapping("/search")

	public ResponseEntity<List<Book>> search(@RequestParam String keyword){
	    return ResponseEntity.ok(bookService.searchTitle(keyword));
	}

	@GetMapping("/genre-author")

	public ResponseEntity<List<Book>> genreAuthor(@RequestParam String genre,@RequestParam String author){

	    return ResponseEntity.ok(bookService.genreAndAuthor(genre,author));
	}

	@GetMapping("/genre-or-author")

	public ResponseEntity<List<Book>> genreOrAuthor(@RequestParam String genre,@RequestParam String author){

	   return ResponseEntity.ok(bookService.genreOrAuthor(genre,author));
	}

	@GetMapping("/price-range")

	public ResponseEntity<List<Book>> priceRange(@RequestParam Double minPrice,@RequestParam Double maxPrice){
	   return ResponseEntity.ok(bookService.priceRange(minPrice,maxPrice));
	}

	@GetMapping("/genre-discount")

	public ResponseEntity<List<Book>> discount(@RequestParam String genre,@RequestParam Double maxPrice){

	   return ResponseEntity.ok(bookService.genreDiscount(genre,maxPrice));
	}

	@GetMapping("/latest")

	public ResponseEntity<?> latest(@RequestParam(defaultValue="0")int page,@RequestParam(defaultValue="5")int size){

	   return ResponseEntity.ok(bookService.latestBooks(page,size));
	}

	@GetMapping("/by-price")

	public ResponseEntity<?> byPrice(@RequestParam(defaultValue="0")int page,@RequestParam(defaultValue="5")int size){

	  return ResponseEntity.ok(bookService.booksByPrice(page,size));
	}
	
	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody Book book){

	return ResponseEntity.ok(bookService.saveBook(book));

	}

	
	
	

}

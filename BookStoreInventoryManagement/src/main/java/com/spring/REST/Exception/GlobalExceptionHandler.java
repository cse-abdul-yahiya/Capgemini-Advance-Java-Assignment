/**
 * 
 */
package com.spring.REST.Exception;

/**
 * 
 */


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(BookNotFoundException.class)

public ResponseEntity<String>
handle(BookNotFoundException ex){

return ResponseEntity.status(404).body(ex.getMessage());

}

}

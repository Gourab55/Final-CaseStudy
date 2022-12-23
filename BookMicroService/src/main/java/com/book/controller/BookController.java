package com.book.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.IBookService;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins="http://localhost:4200/")
public class BookController {
	
	@Autowired
	IBookService bookService;
	
	@PostMapping("/savebook")
	Integer createBook(@RequestBody Book book) {
		
		Integer id=bookService.SaveBook(book);
		System.out.println(id);
		return id;
		
	}
	

	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBook(@PathVariable Integer id)
	{
		
		return new ResponseEntity<Book>(bookService.GetBook(id), HttpStatus.OK);
	}
	
	
	

	@GetMapping("/getbooks")
	public List<Book> getBooks(){
		
		return bookService.GetallBooks();
		
	}
	
	
	@GetMapping("/search")
	public List<Book> getBooksBySearch(@RequestParam String title,
					@RequestParam String author,@RequestParam String publisher,@RequestParam Integer price)
			 {
				return bookService.getBooksBySearch(title, author, publisher, price);
		
	        }
	
	
	
	@PutMapping("/update/{id}")
	
	public ResponseEntity<Book> updateBook(@PathVariable Integer id,@RequestBody Book book)
	{
		return new ResponseEntity<Book>(bookService.UpdateBook(book, id), HttpStatus.OK);
	}
	
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable Integer id){
		
		
	ResponseEntity<Book> responseEntity= new ResponseEntity<>(HttpStatus.OK);
	try {
		bookService.deleteBook(id);
		
	} catch ( Exception e) {
		e.printStackTrace();
	   responseEntity= new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
	return responseEntity;
	
	}
	
	
	

}

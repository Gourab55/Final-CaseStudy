package com.book.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
import com.book.exception.ResourceNotFoundException;

@Service
public class BookServiceImpl implements IBookService{

	
	@Autowired
	IBookRepo bookRepo;
	
	@Override
	public Integer SaveBook(Book book) {
		
		Book saveBook=bookRepo.save(book);
		return saveBook.getId();
		
		
	}

	@Override
	public Book UpdateBook(Book book, Integer id) {
		// we will check a book is exist or not 
		
		Book ExistingBook=bookRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Book","id",id));
		
		
	ExistingBook.setLogo(book.getLogo());
	ExistingBook.setTitle(book.getTitle());
	ExistingBook.setCategory(book.getCategory());
	ExistingBook.setPrice(book.getPrice());
	ExistingBook.setAuthor(book.getAuthor());
	ExistingBook.setPublisher(book.getPublishedDate());
	ExistingBook.setPublishedDate(book.getPublishedDate());
	ExistingBook.setChapter(book.getChapter());
	ExistingBook.setActive(book.getActive());
	
	Book updatedbook=bookRepo.save(ExistingBook);
	
	return updatedbook;
	
		
	}

	@Override
	public List<Book> GetallBooks() {
		
		return bookRepo.findAll();
		
	}

	

	@Override
	public void deleteBook(Integer id) {
		bookRepo.deleteById(id);
		
	}

	@Override
	public Book GetBook(Integer id) {
		Book ExistingBook=bookRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Book","id",id));
		return ExistingBook;
	}

	@Override
	public List<Book> getBooksBySearch(String title, String author, String publisher, Integer price) {
	 
		
		List<Book> allBooks= bookRepo.findAll();
		if(title!=null && author!= null && publisher!= null && price!= null) {
			allBooks=allBooks.stream()
					.filter(bo -> bo.getTitle().equals(title))
					.filter(bo -> bo.getAuthor().equals(author))
					.filter(bo -> bo.getPublisher().equals(publisher))
					.filter(bo -> bo.getPrice() <= price)
					.collect(Collectors.toList());
		}
		System.out.println("Search Results"+ allBooks);
		return allBooks;
	}

	





}

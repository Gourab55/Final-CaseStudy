package com.book.service;

import java.util.List;
import com.book.entity.Book;




public interface IBookService {
	
	Integer  SaveBook(Book book);
	
	Book UpdateBook(Book book, Integer id);
	
	public List<Book> GetallBooks();
	
	Book GetBook(Integer id);
	
	public void deleteBook(Integer id);
	
	public List<Book> getBooksBySearch(String title,String author,String publisher,Integer price);
	
	

}

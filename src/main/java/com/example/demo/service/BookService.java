package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.BookDAO;
import com.example.demo.dto.Book;

@Service
public class BookService {

	@Autowired
	BookDAO bookDAO;
	
	// CRUD
	public List<Book> listBook() {
		return bookDAO.findAll();
	}
	
	public Book BookById(Long id) {
		return bookDAO.findById(id).get();
	}
	
	public Book saveBook(Book book) {
		return bookDAO.save(book);
	}
	
	public Book updateBook(Book book) {
		return bookDAO.save(book);
	}
	
	public void deleteBook(Long id) {
		bookDAO.deleteById(id);
	}
}

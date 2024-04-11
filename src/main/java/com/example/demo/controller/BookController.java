package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/book")
	public List<Book> listBooks() {
		return bookService.listBook();
	}
	
	@GetMapping("/book/{id}")
	public Book bookById(@PathVariable(name = "id") Long id) {
		return bookService.BookById(id);
	}
	
	@PostMapping("/book")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@PutMapping("/book/{id}")
	public Book updatBook(@PathVariable(name = "id") Long id, @RequestBody Book book) {
		Book selectedBook = new Book(id, book.getTitle(), book.getAuthor(), book.getIsbn(), book.getPublisher());
		return bookService.updateBook(selectedBook);	
	}
	
	@DeleteMapping("/book/{id}")
	public void deleteBook(@PathVariable(name = "id") Long id) {
		bookService.deleteBook(id);
	}
}

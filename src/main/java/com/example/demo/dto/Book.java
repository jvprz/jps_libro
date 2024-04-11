package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Column(name="isbn")
	private String isbn;
	@Column(name="publisher")
	private String publisher;
	
	// Constructor
	public Book(String title, String author, String isbn, String publisher, String publish_date) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publisher = publisher;
	}

	//Getter
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	// Setter
	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}

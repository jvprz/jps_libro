package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Book;

public interface BookDAO extends JpaRepository<Book, Long> {}

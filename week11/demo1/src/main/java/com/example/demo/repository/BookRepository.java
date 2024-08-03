package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByTitleContaining(String title);
    Book findByIsbn(int isbn);
    Book findByTitleAndAuthor(String title, String author);
}

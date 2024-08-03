package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
public class BooksController {

    @Autowired
    private BookRepository bookRepository;

    // create your route here
// Create a GET route with the path /books.


    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

//Create a POST route with the path /books.
//
//The method should take a book as a request body parameter.
//
//When hit, the route should return a 201 status and the newly created book returned by BookRepository.


    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    //Create a GET route with the path /books/{isbn} .
    //
    //The path variable must be named isbn and the method parameter must be named bookIsbn. You should know how to handle path variables and method parameters with different names.
    //
    //When hit, the route should return a 200 status and the Book with a matching isbn.


    @GetMapping("/books/{isbn}")
    public Book getBookByIsbn(@PathVariable("isbn") int bookIsbn) {
        return bookRepository.findByIsbn(bookIsbn);
    }

    //Create a GET route with the path /books that takes a title and an author as query parameters (with those names).
    //
    //Both query parameters must be optional.
    //
    //The method parameters should be named optionalTitle and optionalAuthor to follow good practice in variable naming.
    //
    //If neither parameter is present, return a list of all books and a 200 status.
    //
    //If only the title is present, return a list of all books with a matching title and a 200 status.
    //
    //If only the author is present, return a list of all books with a matching author and a 200 status.
    //
    //If both title and author are present, return a list with the single book that matches the title and author and a 200 status.
    //
    //It may be helpful to note the return type of each repository method

    @GetMapping("/books")
    public List<Book> getBooksByTitleAndAuthor(@RequestParam(value = "title", required = false) String optionalTitle, @RequestParam(value = "author", required = false) String optionalAuthor) {
        if (optionalTitle == null && optionalAuthor == null) {
            return bookRepository.findAll();
        } else if (optionalTitle != null && optionalAuthor == null) {
            return bookRepository.findByTitle(optionalTitle);
        } else if (optionalTitle == null && optionalAuthor != null) {
            return bookRepository.findByAuthor(optionalAuthor);
        } else {
            return List.of(bookRepository.findByTitleAndAuthor(optionalTitle, optionalAuthor));
        }

        //List.of() vs List<Book>?
    }



}




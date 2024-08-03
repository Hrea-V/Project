package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
public class Book {

    @Id
    @NotNull
    private final Integer isbn;
    @NotNull
    private final String title;
    @NotNull
    private final String author;

    public Book(Integer isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public Integer getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}

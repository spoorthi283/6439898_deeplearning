package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Publisher {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "publishers", fetch = FetchType.LAZY)
    private List<Book> books;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}
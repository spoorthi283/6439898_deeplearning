package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Book {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private LocalDate publishDate;
    private Double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "book_publisher",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "publisher_id"))
    private List<Publisher> publishers;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public LocalDate getPublishDate() { return publishDate; }
    public void setPublishDate(LocalDate publishDate) { this.publishDate = publishDate; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }
    public List<Publisher> getPublishers() { return publishers; }
    public void setPublishers(List<Publisher> publishers) { this.publishers = publishers; }
}
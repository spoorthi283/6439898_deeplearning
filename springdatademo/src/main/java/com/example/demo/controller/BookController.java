package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/search")
    public List<Book> search(@RequestParam String keyword) {
        return bookRepo.findByTitleContaining(keyword);
    }

    @GetMapping("/top3")
    public List<Book> topBooks() {
        return bookRepo.findTop3ByOrderByPriceDesc();
    }

    @GetMapping("/start")
    public List<Book> startingWith(@RequestParam String prefix) {
        return bookRepo.findByTitleStartingWith(prefix);
    }

    @GetMapping("/by-date")
    public List<Book> booksByDate(@RequestParam String start, @RequestParam String end) {
        return bookRepo.findByPublishDateBetween(LocalDate.parse(start), LocalDate.parse(end));
    }

    @GetMapping("/price/greater")
    public List<Book> expensive(@RequestParam Double price) {
        return bookRepo.findByPriceGreaterThan(price);
    }

    @GetMapping("/price/less")
    public List<Book> cheaper(@RequestParam Double price) {
        return bookRepo.findByPriceLessThan(price);
    }
}
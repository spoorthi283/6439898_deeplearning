package com.example.demo;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(BookRepository bookRepo, AuthorRepository authorRepo) {
        return args -> {
            Author a1 = new Author();
            a1.setName("Leo Tolstoy");
            authorRepo.save(a1);

            Book b1 = new Book();
            b1.setTitle("War and Peace");
            b1.setPrice(600.0);
            b1.setPublishDate(LocalDate.of(2023, 1, 10));
            b1.setAuthor(a1);
            bookRepo.save(b1);

            Book b2 = new Book();
            b2.setTitle("Anna Karenina");
            b2.setPrice(450.0);
            b2.setPublishDate(LocalDate.of(2024, 3, 15));
            b2.setAuthor(a1);
            bookRepo.save(b2);
        };
    }
}
package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String keyword);
    List<Book> findAllByOrderByPriceAsc();
    List<Book> findByTitleStartingWith(String prefix);
    List<Book> findByPublishDateBetween(LocalDate start, LocalDate end);
    List<Book> findByPriceGreaterThan(Double price);
    List<Book> findByPriceLessThan(Double price);
    List<Book> findTop3ByOrderByPriceDesc();
}
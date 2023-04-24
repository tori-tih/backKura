package com.example.bookstore_kur.repository;

import com.example.bookstore_kur.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

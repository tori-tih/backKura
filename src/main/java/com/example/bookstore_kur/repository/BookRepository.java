package com.example.bookstore_kur.repository;

import com.example.bookstore_kur.entity.Book;
import com.example.bookstore_kur.entity.Bookstore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findBooksByBookstore(Bookstore bookstore);
}

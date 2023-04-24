package com.example.bookstore_kur.controller;

import com.example.bookstore_kur.dto.AuthorPojo;
import com.example.bookstore_kur.dto.BookstorePojo;
import com.example.bookstore_kur.entity.Bookstore;
import com.example.bookstore_kur.services.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bookstore")
public class BookstoreController {

    @Autowired
    private BookstoreService bookstoreService;

    @GetMapping
    public List<BookstorePojo> findAll() {return bookstoreService.findAll();}

    @PostMapping
    public BookstorePojo addNewBookstore(@RequestBody BookstorePojo bookstore) {return bookstoreService.addNewBookstore(bookstore);}

    @PutMapping
    public BookstorePojo updateBookstore(@RequestBody BookstorePojo bookstore) {return bookstoreService.addNewBookstore(bookstore);}

    @DeleteMapping("/{id}")
    public void deleteBookstore(@PathVariable Long id) { bookstoreService.deleteBookstore(id);}
}

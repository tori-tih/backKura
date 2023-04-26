package com.example.bookstore_kur.controller;

import com.example.bookstore_kur.dto.BookPojo;
import com.example.bookstore_kur.dto.BookstorePojo;
import com.example.bookstore_kur.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookPojo> findAll() {return bookService.findAll();}

    @PostMapping("/store")
    public List<BookPojo> findByStore(@RequestBody BookstorePojo store) {return  bookService.findByStore(store);}

    @PostMapping
    public BookPojo addNewBook(@RequestBody BookPojo book){ return bookService.addNewBook(book);}

    @PutMapping
    public BookPojo updateBook(@RequestBody BookPojo book){ return bookService.addNewBook(book);}

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) { bookService.deleteBook(id);}
}

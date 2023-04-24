package com.example.bookstore_kur.controller;

import com.example.bookstore_kur.dto.AuthorPojo;
import com.example.bookstore_kur.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<AuthorPojo> findAll() {return authorService.findAll();}

    @PostMapping
    public AuthorPojo addNewAuthor(@RequestBody AuthorPojo author) {return authorService.addNewAuthor(author);}

    @PutMapping
    public AuthorPojo updateAuthor(@RequestBody AuthorPojo author) {return authorService.addNewAuthor(author);}

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) { authorService.deleteAuthor(id);}

}

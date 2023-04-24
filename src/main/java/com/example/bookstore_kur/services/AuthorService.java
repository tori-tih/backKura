package com.example.bookstore_kur.services;

import com.example.bookstore_kur.dto.AuthorPojo;
import com.example.bookstore_kur.entity.Author;
import com.example.bookstore_kur.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    public List<AuthorPojo> findAll(){
        List<AuthorPojo> res = new ArrayList<>();
        for(Author author : authorRepository.findAll())
            res.add(AuthorPojo.fromEntity(author));
        return res;
    }

    public AuthorPojo addNewAuthor(AuthorPojo author){
        return AuthorPojo.fromEntity(authorRepository.save(AuthorPojo.toEntity(author)));
    }

    public void deleteAuthor(Long id) {authorRepository.deleteById(id);}


}

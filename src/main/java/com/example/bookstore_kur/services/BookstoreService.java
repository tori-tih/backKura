package com.example.bookstore_kur.services;


import com.example.bookstore_kur.dto.AuthorPojo;
import com.example.bookstore_kur.dto.BookstorePojo;
import com.example.bookstore_kur.entity.Author;
import com.example.bookstore_kur.entity.Bookstore;
import com.example.bookstore_kur.repository.BookstoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookstoreService {

    private final BookstoreRepository bookstoreRepository;

    public List<BookstorePojo> findAll(){
        List<BookstorePojo> res = new ArrayList<>();
        for(Bookstore bookstore : bookstoreRepository.findAll())
            res.add(BookstorePojo.fromEntity(bookstore));
        return res;
    }

    public BookstorePojo addNewBookstore(BookstorePojo bookstore){
        return BookstorePojo.fromEntity(bookstoreRepository.save(BookstorePojo.toEntity(bookstore)));
    }

    public void deleteBookstore(Long id) {bookstoreRepository.deleteById(id);}


}

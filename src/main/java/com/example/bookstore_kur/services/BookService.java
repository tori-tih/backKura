package com.example.bookstore_kur.services;

import com.example.bookstore_kur.dto.BookPojo;
import com.example.bookstore_kur.entity.Book;
import com.example.bookstore_kur.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<BookPojo> findAll(){
        List<BookPojo> res = new ArrayList<>();
        for(Book book: bookRepository.findAll()){
            res.add(BookPojo.fromEntity(book));
        }
        return res;
    }

    public BookPojo addNewBook(BookPojo book){
        return BookPojo.fromEntity(bookRepository.save(BookPojo.toEntity(book)));
    }

    public void deleteBook(Long id){ bookRepository.deleteById(id);}
}

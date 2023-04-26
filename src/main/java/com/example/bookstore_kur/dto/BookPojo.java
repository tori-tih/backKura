package com.example.bookstore_kur.dto;

import com.example.bookstore_kur.entity.Author;
import com.example.bookstore_kur.entity.Book;
import com.example.bookstore_kur.entity.Bookstore;
import com.example.bookstore_kur.entity.Image;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BookPojo {
    private Long id;
    private String barecode;
    private int count;
    private double price;
    private String image;
//    private Bookstore bookstore;

    private String nameBook;
    private int yearPublic;
    private BookstorePojo bookstore;

    private List<AuthorPojo> authors;

    public static BookPojo fromEntity(Book book){
//        String urlImage = ServletUriComponentsBuilder.fromCurrentContextPath()
//                .path("api/images/")
//                .path(book.getImage().getId())
//                .toUriString();
        BookPojo pojo = new BookPojo();
        pojo.setId(book.getId());
        pojo.setBarecode(book.getBarecode());
        pojo.setCount(book.getCount());
        pojo.setPrice(book.getPrice());
//        pojo.setImage(urlImage);
        pojo.setBookstore(BookstorePojo.fromEntity(book.getBookstore()));

        pojo.setNameBook(book.getNameBook());
        pojo.setYearPublic(book.getYearPublic());
        List<AuthorPojo> authors = new ArrayList<>();
        for(Author author : book.getAuthors()){
            authors.add(AuthorPojo.fromEntity(author));
        }
        pojo.setAuthors(authors);

        return pojo;
    }


    public static Book toEntity(BookPojo pojo){
        Book book = new Book();
        book.setId(pojo.getId());
        book.setBarecode(pojo.getBarecode());
        book.setCount(pojo.getCount());
        book.setPrice(pojo.getPrice());
//        book.setImage(pojo.getImage());

        book.setNameBook(pojo.getNameBook());
        book.setYearPublic(pojo.getYearPublic());
        List<Author> authors = new ArrayList<>();
        for(AuthorPojo author : pojo.getAuthors()){
            authors.add(AuthorPojo.toEntity(author));
        }
        book.setAuthors(authors);
        book.setBookstore(BookstorePojo.toEntity(pojo.getBookstore()));

        return book;
    }
}

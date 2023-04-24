package com.example.bookstore_kur.dto;

import com.example.bookstore_kur.entity.Author;
import lombok.Getter;
import lombok.Setter;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Getter
@Setter
public class AuthorPojo {
    private Long id;
    private String firstname;
    private String lastname;

    public static AuthorPojo fromEntity(Author author){
        AuthorPojo pojo = new AuthorPojo();
        pojo.setId(author.getId());
        pojo.setFirstname(author.getFirstname());
        pojo.setLastname(author.getLastname());

        return pojo;
    }

    public static Author toEntity(AuthorPojo pojo){
        Author author = new Author();
        author.setId(pojo.getId());
        author.setFirstname(pojo.getFirstname());
        author.setLastname(pojo.getLastname());

        return author;
    }
}

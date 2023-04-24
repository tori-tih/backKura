package com.example.bookstore_kur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "books", schema = "public")
@Getter
@Setter
public class Book extends Merchandise{
    private String nameBook;

    private int yearPublic;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "authors",
            joinColumns = @JoinColumn( name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn( name = "author_id", referencedColumnName = "id")
    )
    private List<Author> authors;
}

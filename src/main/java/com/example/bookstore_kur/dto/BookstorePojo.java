package com.example.bookstore_kur.dto;

import com.example.bookstore_kur.entity.Bookstore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookstorePojo {
    private Long id;
    private String address;
    private String number;

    public static BookstorePojo fromEntity(Bookstore bookstore){
        BookstorePojo pojo = new BookstorePojo();
        pojo.setId(bookstore.getId());
        pojo.setAddress(bookstore.getAddress());
        pojo.setNumber(bookstore.getNumber());
        return pojo;
    }
}

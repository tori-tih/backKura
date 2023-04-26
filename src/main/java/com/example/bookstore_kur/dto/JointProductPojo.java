package com.example.bookstore_kur.dto;

import com.example.bookstore_kur.entity.Author;
import com.example.bookstore_kur.entity.Book;
import com.example.bookstore_kur.entity.JointProduct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class JointProductPojo {
    private Long id;
    private String barecode;
    private int count;
    private double price;
    private String image;

    private String nameProduct;
    private BookstorePojo bookstore;

    public static JointProductPojo fromEntity(JointProduct jProduct){
/*        String urlImage = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("api/images/")
                .path(jProduct.getImage().getId())
                .toUriString();*/
        JointProductPojo pojo = new JointProductPojo();
        pojo.setId(jProduct.getId());
        pojo.setBarecode(jProduct.getBarecode());
        pojo.setCount(jProduct.getCount());
        pojo.setPrice(jProduct.getPrice());
        pojo.setBookstore(BookstorePojo.fromEntity(jProduct.getBookstore()));
/*        pojo.setImage(urlImage);*/

        pojo.setNameProduct(jProduct.getNameProduct());

        return pojo;
    }


    public static JointProduct toEntity(JointProductPojo pojo){
        JointProduct jProduct = new JointProduct();
        jProduct.setId(pojo.getId());
        jProduct.setBarecode(pojo.getBarecode());
        jProduct.setCount(pojo.getCount());
        jProduct.setPrice(pojo.getPrice());
        jProduct.setBookstore(BookstorePojo.toEntity(pojo.getBookstore()));
//        book.setImage(pojo.getImage());
        jProduct.setNameProduct(pojo.nameProduct);

        return jProduct;
    }
}

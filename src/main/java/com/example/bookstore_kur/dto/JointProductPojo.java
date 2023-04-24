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
    private String barecode;
    private int count;
    private double price;
    private String image;

    private String nameProduct;

    public static JointProductPojo fromEntity(JointProduct jProduct){
        String urlImage = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("api/images/")
                .path(jProduct.getImage().getId())
                .toUriString();
        JointProductPojo pojo = new JointProductPojo();
        pojo.setBarecode(jProduct.getBarecode());
        pojo.setCount(jProduct.getCount());
        pojo.setPrice(jProduct.getPrice());
        pojo.setImage(urlImage);

        pojo.setNameProduct(jProduct.getNameProduct());

        return pojo;
    }


    public static JointProduct toEntity(JointProductPojo pojo){
        JointProduct jProduct = new JointProduct();
        jProduct.setBarecode(pojo.getBarecode());
        jProduct.setCount(pojo.getCount());
        jProduct.setPrice(pojo.getPrice());
//        book.setImage(pojo.getImage());
        jProduct.setNameProduct(pojo.nameProduct);

        return jProduct;
    }
}

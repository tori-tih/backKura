package com.example.bookstore_kur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products", schema = "public")
@Getter
@Setter
public class JointProduct extends Merchandise{
    private String nameProduct;
}

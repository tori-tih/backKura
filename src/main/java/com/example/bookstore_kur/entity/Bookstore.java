package com.example.bookstore_kur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "bookstores", schema = "public", uniqueConstraints = { @UniqueConstraint(columnNames = "address")})
@Getter
@Setter
public class Bookstore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //автоинкремент
    private Long id;

    @Column(name = "address", columnDefinition = "text", length = 100, nullable = false, unique = true)
    private String address;

    @Column(name = "number", columnDefinition = "text", length = 11, nullable = false)
    private String number;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bookstore", cascade = CascadeType.ALL)
    private List<Merchandise> merchandises;
}

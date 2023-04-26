package com.example.bookstore_kur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "merchandises", schema = "public", uniqueConstraints = { @UniqueConstraint(columnNames = "barecode")})
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Merchandise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //автоинкремент
    private Long id;

    @Column(name = "barecode", columnDefinition = "text", length = 8, nullable = false, unique = true)
    private String barecode;

    private int count;

    private double price;

    @OneToOne (fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.PERSIST
    })

    @JoinColumn(name = "image_id", referencedColumnName = "id", nullable = true)
    private Image image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bookstore", foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT))
    private Bookstore bookstore;
}


package com.example.bookstore_kur.repository;

import com.example.bookstore_kur.entity.Bookstore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookstoreRepository extends JpaRepository<Bookstore, Long> {
}

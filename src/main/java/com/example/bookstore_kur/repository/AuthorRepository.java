package com.example.bookstore_kur.repository;

import com.example.bookstore_kur.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}

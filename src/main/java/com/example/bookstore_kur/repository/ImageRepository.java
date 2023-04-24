package com.example.bookstore_kur.repository;

import com.example.bookstore_kur.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}

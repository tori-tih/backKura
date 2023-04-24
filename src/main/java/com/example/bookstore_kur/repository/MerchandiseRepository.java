package com.example.bookstore_kur.repository;

import com.example.bookstore_kur.entity.Merchandise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchandiseRepository extends JpaRepository<Merchandise, Long> {
}

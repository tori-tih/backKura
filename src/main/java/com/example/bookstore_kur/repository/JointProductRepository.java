package com.example.bookstore_kur.repository;

import com.example.bookstore_kur.entity.Bookstore;
import com.example.bookstore_kur.entity.JointProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JointProductRepository extends JpaRepository<JointProduct, Long> {
    List<JointProduct> findJointProductByBookstore(Bookstore bookstore);
}

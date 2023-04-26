package com.example.bookstore_kur.services;

import com.example.bookstore_kur.dto.AuthorPojo;
import com.example.bookstore_kur.dto.BookPojo;
import com.example.bookstore_kur.dto.BookstorePojo;
import com.example.bookstore_kur.dto.JointProductPojo;
import com.example.bookstore_kur.entity.Author;
import com.example.bookstore_kur.entity.Book;
import com.example.bookstore_kur.entity.JointProduct;
import com.example.bookstore_kur.repository.JointProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JointProductService {

    private final JointProductRepository jointProductRepository;

    public List<JointProductPojo> findAll(){
        List<JointProductPojo> res = new ArrayList<>();
        for(JointProduct jointProduct : jointProductRepository.findAll())
            res.add(JointProductPojo.fromEntity(jointProduct));
        return res;
    }

    public JointProductPojo addNewJproduct(JointProductPojo jointProduct){
        return JointProductPojo.fromEntity(jointProductRepository.save(JointProductPojo.toEntity(jointProduct)));
    }

    public void deleteJproduct(Long id) {jointProductRepository.deleteById(id);}

    public List<JointProductPojo> findByStore(BookstorePojo store) {
        List<JointProductPojo> res = new ArrayList<>();
        for(JointProduct product : jointProductRepository.findJointProductByBookstore(BookstorePojo.toEntity(store))){
            res.add(JointProductPojo.fromEntity(product));
        }
        return res;
    }
}

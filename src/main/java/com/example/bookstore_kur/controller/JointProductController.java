package com.example.bookstore_kur.controller;

import com.example.bookstore_kur.dto.AuthorPojo;
import com.example.bookstore_kur.dto.JointProductPojo;
import com.example.bookstore_kur.services.JointProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jProduct")
public class JointProductController {

    @Autowired
    private JointProductService jointProductService;

    @GetMapping
    public List<JointProductPojo> findAll() {return jointProductService.findAll();}

    @PostMapping
    public JointProductPojo addNewAuthor(@RequestBody JointProductPojo jProduct) {return jointProductService.addNewJproduct(jProduct);}

    @PutMapping
    public JointProductPojo updateAuthor(@RequestBody JointProductPojo jProduct) {return jointProductService.addNewJproduct(jProduct);}

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) { jointProductService.deleteJproduct(id);}

}

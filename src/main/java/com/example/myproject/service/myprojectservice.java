package com.example.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.model.myprojectmodel;
import com.example.myproject.repository.myprojectrepository;
import java.util.List;

@Service
public class myprojectservice {

    @Autowired
    myprojectrepository repository;

    public myprojectmodel create(myprojectmodel table) {
        return repository.save(table);
    }
    public List<myprojectmodel> getAll(){
        return repository.findAll();
    }
}
package com.example.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.model.myprojectmodel;
import com.example.myproject.service.myprojectservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


@RestController
public class myprojectcontroller {

    @Autowired
    myprojectservice service;

    @PostMapping("/create")
    public myprojectmodel create(@RequestBody myprojectmodel table) {
        return service.create(table);
    }
    @GetMapping("/getAll")
    public List<myprojectmodel>getAll(){
        return service.getAll();
    }
}
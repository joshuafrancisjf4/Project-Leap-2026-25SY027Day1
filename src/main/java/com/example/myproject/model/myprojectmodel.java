package com.example.myproject.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Entity 
public class myprojectmodel {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private long phNo; 

}

package com.example.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.myproject.model.myprojectmodel;
@Repository 
public interface myprojectrepository extends JpaRepository<myprojectmodel,Integer> 
{


}

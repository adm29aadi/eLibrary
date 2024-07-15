package com.example.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Library.model.Usermodel;
@Repository
public interface UserRepository extends JpaRepository<Usermodel, Long>{

}

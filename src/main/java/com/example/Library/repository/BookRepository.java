package com.example.Library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Library.model.Bookmodel;
@Repository
public interface BookRepository extends JpaRepository<Bookmodel, Long>{
	List<Bookmodel> findByTitle(String title);
}

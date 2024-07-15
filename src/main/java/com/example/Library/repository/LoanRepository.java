package com.example.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Library.model.Loanmodel;

@Repository
public interface LoanRepository extends JpaRepository<Loanmodel, Long>{
   
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update book set status=0 where book.id = :id")
    void updateBookmodel(@Param(value = "id") Long id);
}

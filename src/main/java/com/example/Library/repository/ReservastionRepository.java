package com.example.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Library.model.Reservationmodel;
@Repository
public interface ReservastionRepository extends JpaRepository<Reservationmodel, Long>{

}

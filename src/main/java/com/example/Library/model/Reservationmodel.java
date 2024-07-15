package com.example.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Reservation")
public class Reservationmodel {
    @Id
	private int book_id;
	private String user_name;
}

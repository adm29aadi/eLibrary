package com.example.Library.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Reservation")
public class Reservationcontroller {

	@PutMapping("/Book")
	public void reservebook(@RequestParam int id) {
		System.out.println("reserve request recieved for book id: "+id);
	}
}

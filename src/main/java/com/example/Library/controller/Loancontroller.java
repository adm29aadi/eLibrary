package com.example.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Library.service.LoanService;

@RestController
@RequestMapping("/Loan")
public class Loancontroller {
    @Autowired
	LoanService loanservice;
	@PutMapping("/Book")
	public void Loanbook(@RequestParam Long id) {
		System.out.println("Loan request for book id:"+ id);
		loanservice.loanservice(id);
		System.out.println("Loan request for book id:"+ id+" completed");
	}
}

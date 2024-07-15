package com.example.Library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Library.repository.LoanRepository;

@Service
public class LoanService {
   @Autowired
   LoanRepository loanrepo;
   public void loanservice(Long id) {
	   System.out.println("before updating bookmodel");
	   loanrepo.updateBookmodel(id);
	   System.out.println("After updating bookmodel");
   }
}

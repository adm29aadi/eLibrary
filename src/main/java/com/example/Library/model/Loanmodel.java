package com.example.Library.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Loan")
public class Loanmodel {
	 @Id
	 private int book_id;
	 private String user_name;
	 private LocalDate borrow_date;
	 private LocalDate return_date;
	 
	 public Loanmodel(int book_id, String user_name, LocalDate borrow_date, LocalDate return_date) {
			super();
			this.book_id = book_id;
			this.user_name = user_name;
			this.borrow_date = borrow_date;
			this.return_date = return_date;
		}
	 
     public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public LocalDate getBorrow_date() {
		return borrow_date;
	}
	public void setBorrow_date(LocalDate borrow_date) {
		this.borrow_date = borrow_date;
	}
	public LocalDate getReturn_date() {
		return return_date;
	}
	public void setReturn_date(LocalDate return_date) {
		this.return_date = return_date;
	}

}

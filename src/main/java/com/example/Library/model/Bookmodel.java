package com.example.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Bookmodel {
 
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String title;
   private String author;
   private int status;
public Bookmodel(long id, String title, String author, int status) {
	super();
	this.id = id;
	title = title;
	author = author;
	this.status = status;
}
public Bookmodel() {
	super();
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	author = author;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}

   
}

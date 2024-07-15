package com.example.Library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Library.model.Bookmodel;
import com.example.Library.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookrepository;
	 public BookService() {
			super();
			
		}
		
		  public List<Bookmodel> AllBook(){ 
			  List<Bookmodel>l1=bookrepository.findAll();
			  System.out.println("printing list");
			  for(Bookmodel book1:l1) {
				  System.out.println(book1.getStatus());
			  }
			  return l1;
			  }
		  
		  public List<Bookmodel> findBooksByTitleStartingWith(String title) {
		        List l1=bookrepository.findByTitle(title);
		        System.out.println("printing list");
				System.out.println(l1.get(0));
		        return l1;
		    }
		  
}
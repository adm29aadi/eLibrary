package com.example.Library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Library.model.Bookmodel;
import com.example.Library.service.BookService;

@RestController
@RequestMapping("/Book")
public class Bookcontroller {
	@Autowired
	private BookService bookservice;
	
    @GetMapping("/BookSearch")
    public List<Bookmodel> fun(@RequestParam String title)
    {
    if(title == "")
       return bookservice.AllBook();
	return bookservice.findBooksByTitleStartingWith(title);
    }
    
    @GetMapping("/allbook")
    public List<Bookmodel> allbook(){
    	return bookservice.AllBook();
    }
}

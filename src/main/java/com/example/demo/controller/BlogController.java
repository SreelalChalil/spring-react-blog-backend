package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BlogController {

	@Autowired
	BlogService blogService;
	
	//reading from application.properties
	@Value("${message.welcome}")
	String message;
	
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String home(){
		return message;
	}
	

	@RequestMapping( value = "/all", method = RequestMethod.GET )
	public Iterable<Blog> allBlog(){
		return blogService.list();
	}
	
	
	@RequestMapping( value = "/new", method = RequestMethod.POST )
	public Blog create(@RequestBody Blog post){
		return blogService.create(post);
	}

}
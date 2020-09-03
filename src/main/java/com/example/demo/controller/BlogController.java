package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Blog;
import com.example.demo.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class BlogController {

	@Autowired
	BlogService blogService;
	
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public Iterable<Blog> list(){
		return blogService.list();
	}
	
	@RequestMapping( value = "/", method = RequestMethod.POST )
	public Blog create(@RequestBody Blog post){
		return blogService.create(post);
	}

}
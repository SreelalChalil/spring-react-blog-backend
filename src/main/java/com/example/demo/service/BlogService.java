package com.example.demo.service;

import java.util.Optional;

import com.example.demo.dao.Blog;

public interface BlogService {
	
	Iterable<Blog> list();
	
	Blog create(Blog post);
	
	Optional<Blog> read(long id);
	
	Blog update(long id, Blog post);
	
	void delete(long id);
}

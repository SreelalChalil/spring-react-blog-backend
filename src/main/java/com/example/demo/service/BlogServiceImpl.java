package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogRepository blogRepository;
	
	@Override
	public Iterable<Blog> list() {
		return blogRepository.findAll();
	}

	@Override
	@Transactional
	public Blog create(Blog post) {
		return blogRepository.save(post);
	}

	@Override
	public Optional<Blog> read(long id) {
		return blogRepository.findById(id);
	}

	@Override
	public Blog update(long id, Blog post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		 blogRepository.deleteById(id);
		
	}

}

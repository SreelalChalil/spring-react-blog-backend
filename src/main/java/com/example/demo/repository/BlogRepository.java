package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.Blog;
@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {

}

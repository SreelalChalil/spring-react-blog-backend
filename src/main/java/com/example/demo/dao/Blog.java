package com.example.demo.dao;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Blog {

	@Id @GeneratedValue
	private Long id;
	
	private String title;
	
	@Column(columnDefinition = "TEXT")
	private String body;
	
	@CreatedDate 
	@Temporal(TemporalType.TIMESTAMP)
	private Date postedOn;

	@SuppressWarnings("unused")
	private Blog(){
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Blog(String title){
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + "]";
	}
	
}


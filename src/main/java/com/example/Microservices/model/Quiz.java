package com.example.Microservices.model;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ElementCollection;

@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	
	@ElementCollection
	private List<Integer> questions;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Integer> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Integer> questions) {
		this.questions = questions;
	}
	public Quiz(Integer id, String title, List<Integer> questions) {
		super();
		this.id = id;
		this.title = title;
		this.questions = questions;
	}
//	
	public Quiz()
	{
		
	}
	
}

package com.example.Microservices.model;

public class QuizDdo 
{
	String category;
	Integer numQ;
	String title;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getNumQ() {
		return numQ;
	}
	public void setNumQ(Integer numQ) {
		this.numQ = numQ;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public QuizDdo(String category, Integer numQ, String title) {
		super();
		this.category = category;
		this.numQ = numQ;
		this.title = title;
	}
	
	public QuizDdo()
	{
		
	}
}

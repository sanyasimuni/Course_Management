package com.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Course_Table")

public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Course_ID")
	private int id;
	private String name;
	private String category;
	private String cost;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, String category, String cost) {
		super();
		this.name = name;
		this.category = category;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", category=" + category + ", cost=" + cost + "]";
	}
	
	
	

}

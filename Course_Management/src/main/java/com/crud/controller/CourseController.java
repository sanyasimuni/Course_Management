package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Course;
import com.crud.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	
	@PostMapping("/course")
	public ResponseEntity<String>insertcoursedata(@RequestBody Course course){
		
		         String co= service.upsert(course);
		         return new ResponseEntity<>(co,HttpStatus.CREATED);
		
	}
	//get single id
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course>getsingleByid(@PathVariable int cid){
		
		                  Course course=service.getcourseByid(cid);
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
	
	//list of data will be get
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>>getlistofUser(){
		
		            List<Course> co=service.getallCourse();	
		            
		            return new ResponseEntity<List<Course>>(co,HttpStatus.OK);
	}
	
	
	//update the course information
	
	@PutMapping("/course")
	public ResponseEntity<String>Updatecourse(@RequestBody Course course){
		
		                 String ts=service.upsert(course);
		                 return new ResponseEntity<String>(ts,HttpStatus.OK);
		                 
		
	}
	
	@DeleteMapping("/delete/{cid}")
	public ResponseEntity<String >DeleteCourse(@PathVariable int cid){
		  String s=service.deleteByid(cid);
		  
		  return new ResponseEntity<>(s,HttpStatus.OK);
		
	}
}

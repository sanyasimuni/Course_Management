package com.crud.service;

import java.util.List;

import com.crud.model.Course;

public interface CourseService {
	
	//insert/update both operation perform
	public String upsert(Course course);
	
	//course id get
	public Course getcourseByid(int cid);
	
	//list of course get
	
	public List<Course>getallCourse();
	
	//delete by id
	
	public String deleteByid(int cid);

}

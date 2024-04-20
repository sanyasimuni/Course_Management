package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Repo.CourseRepo;
import com.crud.model.Course;

@Service
public class CourseServiceImpl implements CourseService {
@Autowired
private CourseRepo repo;
	
	
	
	
	@Override
	public String upsert(Course course) {
		           repo.save(course);
		return "save Successfully...." ;
	}

	@Override
	public Course getcourseByid(int cid) {
	    
		 Optional<Course> c=repo.findById(cid);
		 if (c.isPresent()) {
			 return c.get();
		 }else {
				return c.get();
			}
	}

	@Override
	public List<Course> getallCourse() {
		      return  repo.findAll();
		        
	}

	@Override
	public String deleteByid(int cid) {
	
		
		if (repo.existsById(cid)) {
		      repo.deleteById(cid);
		      return "Delete Success fully";
		}else {
			return "Not Deleted ";
		}
		
		
	}

}

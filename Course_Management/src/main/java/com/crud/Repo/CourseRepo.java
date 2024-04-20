package com.crud.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Course;

public interface CourseRepo extends JpaRepository<Course, Serializable> {

	

}

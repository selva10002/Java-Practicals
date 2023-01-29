package com.boot.service;

import java.util.List;

import com.boot.payload.CourseDTO;

public interface CourseService
{
	//add course
	public  CourseDTO addCourse(CourseDTO CourseDto);
	
	//view all Courses
	public List<CourseDTO> getAllCourse();
	
	//view particular Course by Id
	public CourseDTO getCourseById(int courseId);
	
	//update Course By Id
	public CourseDTO updateCourseById(CourseDTO courseDto,int courseId);
	
	//delete Course By id
	public void deleteCourseById(int courseId);

}

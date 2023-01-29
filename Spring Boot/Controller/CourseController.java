package com.boot.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.exception.APIResponse;
import com.boot.payload.CourseDTO;
import com.boot.service.CourseService;


@RestController
@RequestMapping("/course")
public class CourseController 
{
	@Autowired
	private CourseService service;

	@PostMapping("/save")
	public ResponseEntity<CourseDTO> addCouse(@RequestBody CourseDTO courseDto)
	{
		
		CourseDTO addCourse = this.service.addCourse(courseDto);
		return new ResponseEntity<CourseDTO>(addCourse,HttpStatus.CREATED);
	}
	
	@GetMapping("/viewAll")
	public ResponseEntity<List<CourseDTO>> getAllCourse()
	{
		List<CourseDTO> getAllCourse = this.service.getAllCourse();
		return new ResponseEntity<List<CourseDTO>>(getAllCourse,HttpStatus.OK);
	}
	
	@GetMapping("/view/{courseId}")
	public ResponseEntity<CourseDTO> getCourseById(@PathVariable("courseId") int courseId)
	{
		CourseDTO courseById = this.service.getCourseById(courseId);
		return new ResponseEntity<CourseDTO>(courseById,HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{courseId}")
	public ResponseEntity<CourseDTO> updateCourseById(@RequestBody CourseDTO courseDto,@PathVariable("courseId") int courseId)
	{
		CourseDTO updateCourseById = this.service.updateCourseById(courseDto, courseId);
		return new ResponseEntity<CourseDTO>(updateCourseById,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{courseId}")
	public ResponseEntity<APIResponse> deleteCourseById(@PathVariable("courseId") int courseId)
	{
		this.service.deleteCourseById(courseId);
		
		APIResponse response=new APIResponse();
		response.setMessage("Record is Deleted SuccessFully In ID :"+courseId);
		response.setStatus(true);
		return null;
	}
	
	
}

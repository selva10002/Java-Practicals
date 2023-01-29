package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.payload.EnrolledCourseDTO;
import com.boot.service.EnrolledCourseService;

@RestController
@RequestMapping("/enrollCourse")
public class EnrolledCourseController 
{
	@Autowired
	private EnrolledCourseService service;
	
	@PostMapping("/save")
	public ResponseEntity<EnrolledCourseDTO> addEnroll(@RequestBody EnrolledCourseDTO enrolledCourseDto)
	{
		EnrolledCourseDTO addEnroll = this.service.addEnroll(enrolledCourseDto);
		return new ResponseEntity<EnrolledCourseDTO>(addEnroll,HttpStatus.CREATED);
	}

}

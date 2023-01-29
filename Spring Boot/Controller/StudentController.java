package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.payload.StudentDTO;
import com.boot.service.StudentService;
@RestController
@RequestMapping("/student")
public class StudentController
{
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	
	public ResponseEntity<StudentDTO> saveStudentData(@RequestBody StudentDTO studentDto)
	{
		StudentDTO savedStudent =this.studentService.addStudentData(studentDto);
		
		return new ResponseEntity<StudentDTO>(savedStudent,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<StudentDTO>> getAllStudentRecord()
	{
		List<StudentDTO> studentList=this.studentService.getAllStudentData();
		return new ResponseEntity<List<StudentDTO>>(studentList,HttpStatus.OK);
	}
	
	@GetMapping("/{studentId}")
	public ResponseEntity<StudentDTO> getStudentById(@PathVariable("studentId") int studentId)
	{
		 StudentDTO getStudent=this.studentService.getStudentById( studentId);
		return new ResponseEntity<StudentDTO>(getStudent,HttpStatus.OK);
	}
	
	@PutMapping("/{studentId}")
	public ResponseEntity<StudentDTO> updateStudentById(@RequestBody StudentDTO studentDto,@PathVariable("studentId") int studentId)
	{
		StudentDTO updateStudent = this.studentService.updateStudentDataById(studentDto, studentId);
		return new ResponseEntity<StudentDTO>(updateStudent,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{studentId}")
	public void deleteStudentById(@PathVariable("studentId") int studentId)
	{
		this.studentService.deleteStrudentDataById(studentId);
	}
	
	
	
}

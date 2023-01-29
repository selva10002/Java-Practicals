package com.boot.service;

import java.util.*;
import com.boot.payload.StudentDTO;

public interface StudentService
{
	//add data method
	public StudentDTO addStudentData(StudentDTO studentDto);
	
	//Display All Student list
	public List<StudentDTO> getAllStudentData();

	//get Student by ID
	public StudentDTO getStudentById(int studentID);
	
	//update student record by id
	public StudentDTO updateStudentDataById(StudentDTO studentDto,int studentId);
	
	//delete student record by id
	public void deleteStrudentDataById(int studentId);
}

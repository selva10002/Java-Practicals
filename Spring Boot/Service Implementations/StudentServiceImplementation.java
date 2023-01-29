package com.boot.serviceimpl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.boot.entity.StudentEntity;
import com.boot.exception.ResourseNotFundException;
import com.boot.payload.StudentDTO;
import com.boot.repository.StudentRepository;
import com.boot.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService 

{

	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public StudentDTO addStudentData(StudentDTO studentDto) 
	{
		  StudentEntity studentEntity=  this.modelMapper.map(studentDto, StudentEntity.class);
		
		  StudentEntity saveStudent=this.repository.save(studentEntity);
		  
		  return this.modelMapper.map(saveStudent, StudentDTO.class);
//		StudentEntity studentEntity=studentDtoToStudentEntity(studentDto);
//		
//		StudentEntity savedStudent=this.repository.save(studentEntity);
//		return studnetEntityToStudnetDto(savedStudent);
	}

	@Override
	public List<StudentDTO> getAllStudentData() 
	{
		List<StudentEntity> getAllstudent=this.repository.findAll();
		List<StudentDTO> studentDto=getAllstudent.stream().map(studentObj->this.modelMapper.map(studentObj, StudentDTO.class)).collect(Collectors.toList());
		

		return studentDto;
	}
	
	@Override
	public StudentDTO getStudentById(int studentID)
	{
		if(repository.existsById(studentID))
		{
		StudentEntity getStudent = this.repository.findById(studentID).get();
		StudentDTO studentDto=this.modelMapper.map(getStudent, StudentDTO.class);
		return studentDto;
		}
		else
		{
			throw new ResourseNotFundException("Student", "Student ID", studentID);
		}
	}



	@Override
	public StudentDTO updateStudentDataById(StudentDTO studentDto, int studentId) 
	{
		if(repository.existsById(studentId))
		{
		StudentEntity studentEntity = this.modelMapper.map(studentDto, StudentEntity.class);
		StudentEntity updateStudent = this.repository.save(studentEntity);
		
		return this.modelMapper.map(updateStudent, StudentDTO.class);
		
		}
		
		else
		{
			throw new ResourseNotFundException("Student", "Student ID", studentId);
		}
		
	}

	@Override
	public void deleteStrudentDataById(int studentId)
	{
		if(repository.existsById(studentId))
		{
		this.repository.deleteById(studentId);
		}
		
		else 
		{
			throw new ResourseNotFundException("Student", "Student ID", studentId);
		}
	}
//	
//	public StudentEntity studentDtoToStudentEntity(StudentDTO studentDto)
//	{
//		StudentEntity studentEntity=new StudentEntity();
//		
//		studentEntity.setStudentId(studentDto.getStudentId());
//		studentEntity.setStudentName(studentDto.getStudentName());
//		studentEntity.setStudentLocation(studentDto.getStudentLocation());
//		studentEntity.setStudentEmail(studentDto.getStudentEmail());
//		
//		return studentEntity;
//	}
//	
//	public StudentDTO studnetEntityToStudnetDto(StudentEntity studentEntity)
//	{
//		StudentDTO studentDto=new StudentDTO();
//		
//		studentDto.setStudentId(studentEntity.getStudentId());
//		studentDto.setStudentName(studentEntity.getStudentName());
//		studentDto.setStudentLocation(studentEntity.getStudentLocation());
//		studentDto.setStudentEmail(studentEntity.getStudentEmail());
//		
//		return studentDto;
//	}

	
	
}

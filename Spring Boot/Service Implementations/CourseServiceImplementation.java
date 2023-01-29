package com.boot.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.boot.entity.CourseEntity;
import com.boot.exception.CourseNameFoundException;
import com.boot.exception.ResourseNotFundException;
import com.boot.payload.CourseDTO;
import com.boot.repository.CourseRepository;
import com.boot.service.CourseService;

@Service
public class CourseServiceImplementation implements CourseService
{
	@Autowired
	private CourseRepository repository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CourseDTO addCourse(CourseDTO CourseDto) 
	{
		CourseEntity course = this.repository.findByCourseName(CourseDto.getCourseName());
		
		if(course==null)
		{
		CourseEntity courseEntity = this.modelMapper.map(CourseDto, CourseEntity.class);
		CourseEntity saveCourse = this.repository.save(courseEntity);
		return this.modelMapper.map(saveCourse, CourseDTO.class);
		}
		
		else
		{
			throw new CourseNameFoundException("this Course name already Exists");
		}
	}

	@Override
	public List<CourseDTO> getAllCourse()
	{
		List<CourseEntity> getAllCourse = this.repository.findAll();
		List<CourseDTO> courseDto = getAllCourse.stream().map(obj->this.modelMapper.map(obj, CourseDTO.class)).collect(Collectors.toList());
		return courseDto;
	}

	@Override
	public CourseDTO getCourseById(int courseId) 
	{
		if(this.repository.existsById(courseId))
		{
		CourseEntity courseEntity = this.repository.findById(courseId).get();
		CourseDTO courseDto = this.modelMapper.map(courseEntity, CourseDTO.class);
		
		return courseDto;
		}
		else
		{
			throw new ResourseNotFundException("Course", "CourseId", courseId);
		}
	}

	@Override
	public CourseDTO updateCourseById(CourseDTO courseDto, int courseId) 
	{
		if(this.repository.existsById(courseId))
		{
		CourseEntity courseEntity  = this.modelMapper.map(courseDto, CourseEntity.class);
		CourseEntity updateCourse = this.repository.save(courseEntity);
		return this.modelMapper.map(updateCourse, CourseDTO.class);
		}
		else
		{
			throw new ResourseNotFundException("Course", "CourseId", courseId);
		}
	}

	@Override
	public void deleteCourseById(int courseId) 
	{
		if(this.repository.existsById(courseId))
		{
		this.repository.deleteById(courseId);
		}
		else
		{
			throw new ResourseNotFundException("Course", "CourseId", courseId);
		}
	}

}

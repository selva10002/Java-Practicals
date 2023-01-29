package com.boot.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.EnrolledCourseEntity;
import com.boot.payload.EnrolledCourseDTO;
import com.boot.repository.EnrolledCourseRepository;
import com.boot.service.EnrolledCourseService;

@Service
public class EnrolledCourseServiceImplementation implements EnrolledCourseService
{
	@Autowired
	private EnrolledCourseRepository repository;

	private ModelMapper modelMapper;
	@Override
	public EnrolledCourseDTO addEnroll(EnrolledCourseDTO enrollDto)
	{
		EnrolledCourseEntity entity = this.modelMapper.map(enrollDto, EnrolledCourseEntity.class);
		EnrolledCourseEntity saveEnroll = this.repository.save(entity);
		return this.modelMapper.map(saveEnroll, EnrolledCourseDTO.class);
	}

}

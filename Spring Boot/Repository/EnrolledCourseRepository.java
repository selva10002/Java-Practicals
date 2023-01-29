package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.EnrolledCourseEntity;

public interface EnrolledCourseRepository extends JpaRepository<EnrolledCourseEntity, Integer> 
{

}

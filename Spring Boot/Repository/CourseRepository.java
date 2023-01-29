package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer>
{

	public CourseEntity findByCourseName(String course);
}

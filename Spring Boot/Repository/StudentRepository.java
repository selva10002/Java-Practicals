package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>
{
	

}

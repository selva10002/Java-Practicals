package com.boot.entity;



import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@Entity
public class CourseEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	@Column(length=30)
	private String courseName;
	@Column(length=30)
	private String courseDuration;
	@Column
	private int courseFee;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "")
	Set<EnrolledCourseEntity> enrollCourseSet=new HashSet();
}

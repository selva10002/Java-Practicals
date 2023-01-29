package com.boot.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="student_tbl")
public class StudentEntity
{
	@Id
	private int studentId;
	@Column
	private String studentName;
	@Column
	private String studentLocation;
	@Column(unique=true)
	private String studentEmail;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="student")
	Set<EnrolledCourseEntity> enrollCourseSet=new HashSet<>();
}

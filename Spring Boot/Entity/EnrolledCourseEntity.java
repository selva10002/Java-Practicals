package com.boot.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@Table(name="enrollcourse_tbl")
public class EnrolledCourseEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enrollCourseId;

	@ManyToOne
	@JoinColumn(name="sid")
	private StudentEntity student;
	
	@ManyToOne
	@JoinColumn(name="cid")
	private CourseEntity course;
}

package com.boot.payload;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class CourseDTO 
{
	
	private int courseId;
	
	private String courseName;
	
	private String courseDuration;
	
	private int courseFee;

}

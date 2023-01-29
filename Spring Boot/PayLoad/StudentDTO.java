package com.boot.payload;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter// getter and setter methods
@Setter
@NoArgsConstructor
@ToString
public class StudentDTO
{

	private int studentId;
	
	private String studentName;
	
	private String studentLocation;
	
	private String studentEmail;
}

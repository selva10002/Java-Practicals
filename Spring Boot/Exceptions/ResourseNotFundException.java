package com.boot.exception;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class ResourseNotFundException extends RuntimeException
{
	private String resourseName;

	private String fieldName;
	
	private int fieldId;
	
	public ResourseNotFundException(String resourseName, String fieldName, int fieldId)
	{
		super(String.format("%s is not present %s :%d",resourseName,fieldName,fieldId));
		this.resourseName = resourseName;
		this.fieldName = fieldName;
		this.fieldId = fieldId;
	}
	
}

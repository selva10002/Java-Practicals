package com.boot.exception;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class APIResponse 
{
	private String message;
	
	private boolean status;

	public APIResponse(String message, boolean status)
	{
		super();
		this.message = message;
		this.status = status;
	}

	
}

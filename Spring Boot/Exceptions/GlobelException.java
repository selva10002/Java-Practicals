package com.boot.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobelException 
{
	
	
	
	@ExceptionHandler(ResourseNotFundException.class)
	public ResponseEntity<APIResponse> getException(ResourseNotFundException ex)
	{
		String message= ex.getMessage();
		
		APIResponse response = new APIResponse();
		
		response.setMessage(message);
		response.setStatus(false);
		
		return new ResponseEntity<APIResponse>(response,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(CourseNameFoundException.class)
	public ResponseEntity<APIResponse> getException(CourseNameFoundException ex)
	{
		String message = ex.getMessage();
		
		APIResponse responsce =new  APIResponse();
		responsce.setMessage(message);
		responsce.setStatus(false);
		
		return new ResponseEntity<APIResponse>(responsce,HttpStatus.OK);
	}

}

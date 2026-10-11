package com.studentmanagement.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleHandler {
	
	@ExceptionHandler(StudentNotException.class)
	public ResponseEntity<ErrorResponse> handler(StudentNotException ex)
	{
		ErrorResponse er=new ErrorResponse();
		
		er.setMessage(ex.getMessage());
		er.setTime(LocalDateTime.now());
		
		return new ResponseEntity<>(er,HttpStatus.NOT_FOUND);
	}
	

}
class ErrorResponse{
	
	LocalDateTime Time;
	String message;

	
	public LocalDateTime getTime() {
		return Time;
	}

	public void setTime(LocalDateTime time) {
		Time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
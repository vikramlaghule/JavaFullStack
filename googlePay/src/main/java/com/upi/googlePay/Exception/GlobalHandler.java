package com.upi.googlePay.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(StdudentWithIDNotFound.class)
	public ResponseEntity<ErrorResponse> studentNotfoundHandler(StdudentWithIDNotFound ex)
	{
		ErrorResponse er =new ErrorResponse();
		
		er.setMessage(ex.getMessage());
		er.setCausedAt(ex.getStackTrace()[0].toString());
		er.setTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorResponse>(er, HttpStatus.INTERNAL_SERVER_ERROR) ;
		
	}
	
}

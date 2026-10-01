package com.upi.googlePay.Exception;

import java.time.LocalDateTime;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse2> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex)
	{
	
		System.out.println(ex.getErrorCount());
//		
//		System.out.println(ex.getFieldError().getDefaultMessage());
//		System.out.println(ex.getFieldError().getField());
		
		HashMap<String, String> mp=new HashMap<String, String>();
		
		
		ex.getBindingResult().getFieldErrors().stream().forEach(s->{
			mp.put(s.getField(), s.getDefaultMessage());
		});
		
		
		ErrorResponse2 er=new ErrorResponse2(mp,LocalDateTime.now());
		
		return new ResponseEntity<ErrorResponse2>(er,HttpStatus.BAD_REQUEST);
	}
	
}

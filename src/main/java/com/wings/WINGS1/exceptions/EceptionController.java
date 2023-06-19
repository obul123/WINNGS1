package com.wings.WINGS1.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class EceptionController extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity handleBadRequestException(BadRequestException exception , WebRequest request)
	{
		ExceptionBody eb=new ExceptionBody(new Date(),exception.getMessage() , request.getDescription(false));
		return new ResponseEntity(eb,HttpStatus.BAD_REQUEST);
	}
}

package com.hexaware.cricketteam.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


	@RestControllerAdvice
	public class PlayerExceptionalHandler {
		
	@ExceptionHandler({Exception.class})
	public ResponseEntity<String>  handleAnyExp(Exception e) {
		
		return  new ResponseEntity<String>(e.toString(),HttpStatus.BAD_REQUEST);
	}

	}



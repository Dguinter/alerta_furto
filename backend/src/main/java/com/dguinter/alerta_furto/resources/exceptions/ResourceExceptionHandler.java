
package com.dguinter.alerta_furto.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dguinter.alerta_furto.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e, HttpServletRequest request){
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(HttpStatus.SC_NOT_FOUND);
		err.setError("Resource not Found");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.SC_NOT_FOUND).body(err);
		
		
	}

}

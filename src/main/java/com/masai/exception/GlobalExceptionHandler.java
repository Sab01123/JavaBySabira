package com.masai.exception;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Error> methodArgumentNotValidExceptionHandeler(MethodArgumentNotValidException e,WebRequest web){
		Error err = new Error(e.getMessage(), LocalDate.now(), LocalTime.now(), web.getDescription(false));
		return new ResponseEntity<Error>(err, HttpStatus.BAD_GATEWAY);
	}	
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Error> illegalArgumentException(IllegalArgumentException e,WebRequest web){
		Error err = new Error(e.getMessage(), LocalDate.now(), LocalTime.now(), web.getDescription(false));
		return new ResponseEntity<Error>(err, HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(DriverException.class)
	public ResponseEntity<Error> driverException(DriverException e,WebRequest web){
		Error err = new Error(e.getMessage(), LocalDate.now(), LocalTime.now(), web.getDescription(false));
		return new ResponseEntity<Error>(err, HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<Error> customerException(CustomerException e,WebRequest web){
		Error err = new Error(e.getMessage(), LocalDate.now(), LocalTime.now(), web.getDescription(false));
		return new ResponseEntity<Error>(err, HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Error> exception(Exception e,WebRequest web){
		Error err = new Error(e.getMessage(), LocalDate.now(), LocalTime.now(), web.getDescription(false));
		return new ResponseEntity<Error>(err, HttpStatus.BAD_GATEWAY);
	}
}

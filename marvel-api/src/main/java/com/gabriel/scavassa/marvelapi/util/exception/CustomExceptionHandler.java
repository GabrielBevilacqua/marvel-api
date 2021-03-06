package com.gabriel.scavassa.marvelapi.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(value = NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse exception(NotFoundException exeption) {
		return new ErrorResponse("NaoEncontradoException", exeption.getMessage());
	}
}

package com.app.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ControllerAdvice
@EnableWebMvc
public class GlobalExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public String handleException(HttpServletRequest request, Exception exception) {
		return "error.jsp";
	}
}

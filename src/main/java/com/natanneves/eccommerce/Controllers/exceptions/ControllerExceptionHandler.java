package com.natanneves.eccommerce.Controllers.exceptions;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.Serializable;

@ControllerAdvice
public class ControllerExceptionHandler implements Serializable {
    private static final long serialVersionUID = 1L;

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardError> NotfoundException(NotFoundException e, HttpServletRequest request){
        StandardError erro = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }
}

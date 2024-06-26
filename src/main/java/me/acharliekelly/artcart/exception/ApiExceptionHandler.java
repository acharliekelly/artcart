package me.acharliekelly.artcart.exception;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

  @SuppressWarnings("rawtypes")
  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity<ErrorResponse> handle(ConstraintViolationException e) {
    ErrorResponse errors = new ErrorResponse();
    for (ConstraintViolation violation : e.getConstraintViolations()) {
      ErrorItem error = new ErrorItem();
      error.setCode(violation.getMessageTemplate());
      error.setMessage(violation.getMessage());
      errors.addError(error);
    }
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }

  @SuppressWarnings("rawtypes")
  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<ErrorItem> handle(ResourceNotFoundException e) {
    ErrorItem error = new ErrorItem();
    error.setMessage(e.getMessage());

    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
  }
}

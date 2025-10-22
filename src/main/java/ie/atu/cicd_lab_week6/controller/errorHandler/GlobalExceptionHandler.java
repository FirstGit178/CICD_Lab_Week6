package ie.atu.cicd_lab_week6.controller.errorHandler;

import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String showErrorDetails(MethodArgumentNotValidException mae) {
        return "Test";
    }
}

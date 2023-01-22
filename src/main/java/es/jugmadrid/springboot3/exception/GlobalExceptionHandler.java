package es.jugmadrid.springboot3.exception;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.URI;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    ProblemDetail handleServiceException(ServiceException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(e.getErrorCode().getHttpStatus(), e.getDescription());
        problemDetail.setTitle(e.getErrorCode().getHttpStatus().name());
        problemDetail.setType(URI.create("https://example.com/exceptions"));
        return problemDetail;
    }
}
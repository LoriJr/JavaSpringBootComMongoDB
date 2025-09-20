package com.loujunior.appcommongo.services.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.Instant;


@RestControllerAdvice
public class ResourceExceptionHandler extends RuntimeException{

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){

        HttpStatus status = HttpStatus.NOT_FOUND;
        Instant agora = Instant.now();
        String aviso = "Não encontrado";
        StandardError err = new StandardError(agora, status.value(), aviso, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}

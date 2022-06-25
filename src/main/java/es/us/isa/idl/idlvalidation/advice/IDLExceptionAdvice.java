package es.us.isa.idl.idlvalidation.advice;

import es.us.isa.idl.idlvalidation.model.RequestValidationResponse;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import idlanalyzer.configuration.IDLException;
@Log
@ControllerAdvice
public class IDLExceptionAdvice {

    @ExceptionHandler(IDLException.class)
    public ResponseEntity<RequestValidationResponse> handleIDLException(IDLException e) {

        log.info(e.getMessage());

        return ResponseEntity.badRequest().body(new RequestValidationResponse(false,e.getMessage()));
    }
}

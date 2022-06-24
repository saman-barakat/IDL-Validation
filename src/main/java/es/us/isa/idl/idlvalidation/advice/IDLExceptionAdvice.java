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
        RequestValidationResponse response = new RequestValidationResponse();
        response.setValid(false);
        response.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(response);
    }
}

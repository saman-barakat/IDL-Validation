package es.us.isa.idl.idlvalidation.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import es.us.isa.idl.idlvalidation.model.RequestValidationResponse;
import idlanalyzer.analyzer.Analyzer;
import idlanalyzer.analyzer.OASAnalyzer;
import idlanalyzer.configuration.IDLException;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Log
@RestController
@RequestMapping("/api")
public class IDLValidationController {

    private static final String SPEC_URL = "./src/test/resources/OASFile/openapi.yaml";
    private static final String OPERATION_PATH = "operationPath";
    private static final String OPERATION_TYPE = "operationType";
    private static final String PARAMETERS = "parameters";

    @GetMapping("/validation")
    public ResponseEntity<RequestValidationResponse> isValidRequestGet(
            @RequestParam(name = OPERATION_PATH) String operationPath,
            @RequestParam(name = OPERATION_TYPE) String operationType,
            @RequestParam(name = PARAMETERS) String parameters)
            throws IDLException {

        try {
            ObjectMapper mapper = new ObjectMapper();

            Map<String, String> request = mapper.readValue(parameters, new TypeReference<Map<String, String>>() {
            });

            Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);

            boolean valid = analyzer.isValidRequest(request);

            if (!valid)
                throw new IDLException("The Request is invalid!");

            RequestValidationResponse response = new RequestValidationResponse();
            response.setValid(true);
            response.setMessage("The Request is valid!");
            log.info(response.getMessage());

            return ResponseEntity.ok(response);

        } catch (JsonProcessingException e) {
            throw new IDLException(e.getMessage());
        }
    }
}

package es.us.isa.idl.idlvalidation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RequestValidationResponse {
    private Boolean valid;
    private String message;

    public RequestValidationResponse(Boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }
}

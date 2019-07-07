package br.com.fiap.spring.data.mongodb.advice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.http.HttpStatus;

/**
 * Exception padrão para normalizar o response em caso de exceções e validações
 */
public class ResponseError extends RuntimeException {

    @JsonIgnore
    private HttpStatus status;

    private String message;

    public ResponseError(String message){
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
        this.message = message;
    }

    public ResponseError(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}

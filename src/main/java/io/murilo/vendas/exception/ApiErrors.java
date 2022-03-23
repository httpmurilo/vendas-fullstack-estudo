package io.murilo.vendas.exception;


import java.util.Arrays;
import java.util.List;

public class ApiErrors {

    public ApiErrors(List<String> errors) {
        this.errors = errors;
    }

    public ApiErrors(String message) {
        this.errors = Arrays.asList(message);
    }

    private List<String> errors;

    public List<String> getErrors() {
        return errors;
    }
}

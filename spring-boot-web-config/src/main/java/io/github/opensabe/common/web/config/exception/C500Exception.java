package io.github.opensabe.common.web.config.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class C500Exception extends RESTFull5xxBaseException implements Serializable {
    private static final long serialVersionUID = -2312393803704717855L;

    public C500Exception(String message) {
        super(message);
    }
}

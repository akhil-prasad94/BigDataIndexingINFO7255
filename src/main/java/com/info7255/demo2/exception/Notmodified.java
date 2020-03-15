package com.info7255.demo2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value= HttpStatus.NOT_MODIFIED)
public class Notmodified extends RuntimeException {
        private String message;
        public Notmodified(String message) {
            super(String.format("%s",message));
            this.message=message;
        }
        @Override
        public String getMessage() {
            return message;
        }
    }

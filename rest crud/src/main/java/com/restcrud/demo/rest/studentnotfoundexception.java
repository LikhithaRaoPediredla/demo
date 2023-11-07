package com.restcrud.demo.rest;

public class studentnotfoundexception extends RuntimeException{
    public studentnotfoundexception(String message) {
        super(message);
    }

    public studentnotfoundexception(String message, Throwable cause) {
        super(message, cause);
    }

    public studentnotfoundexception(Throwable cause) {
        super(cause);
    }
}

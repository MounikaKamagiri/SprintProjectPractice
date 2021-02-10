package com.empmgt.exceptions;

public class InvalidIdException extends RuntimeException{
    public InvalidIdException(String msg){
        super(msg);
    }
}
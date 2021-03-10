package com.cg.apps.employeemswithoutjpa.exceptions;

public class InvalidScoreException extends RuntimeException{
    public InvalidScoreException(String msg){
        super(msg);
    }
}

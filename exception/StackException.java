package com.company.exception;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class StackException extends Exception {
    private String msg;
    public StackException(String msg){
        this.msg = msg;
    }
    public String toString(){
        return msg;
    }
}

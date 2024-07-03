package com.ingenico.m360.testingproject.error;

public class DepartmentNotFoundException extends Exception{
    public DepartmentNotFoundException(){}
    public DepartmentNotFoundException(String message){
        super(message);
    }
    public DepartmentNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    public DepartmentNotFoundException(Throwable cause){}

}

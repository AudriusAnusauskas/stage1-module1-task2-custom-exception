package com.epam.mjc;

public class CouldNotFindStudentWithIdException extends IllegalArgumentException{
   public CouldNotFindStudentWithIdException(String message){
        super(message);
    }
}

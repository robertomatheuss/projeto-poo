package br.ifal.edu.domain.exceptions;

public class StudentAlreadyEnrolledException extends RuntimeException{
    public StudentAlreadyEnrolledException(String msg){
        super(msg + "Já está matriculado nesse curso");
    }
}

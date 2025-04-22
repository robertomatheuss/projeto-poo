package br.ifal.edu.domain.exceptions;

public class StudentAlreadyExistException extends RuntimeException {
    public StudentAlreadyExistException(String msg){
        super(msg + "Já está matriculado nesse curso");
    }
}

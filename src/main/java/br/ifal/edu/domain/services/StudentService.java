package br.ifal.edu.domain.services;

import br.ifal.edu.domain.entities.Student;
import br.ifal.edu.domain.exceptions.StudentAlreadyExistException;
import br.ifal.edu.domain.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> alunos = new ArrayList<>();

    public void registerStudent(Student newStudent){
        try {
            if (jaExisteCpf(newStudent.getCpf())) {
                throw new StudentAlreadyExistException("Já existe um aluno com este CPF.");
            }
        }catch (StudentAlreadyExistException e ){
            System.out.println(e.getMessage());
        }
        UserService.validarDadosComuns(newStudent);
        alunos.add(newStudent);
    }

    public Student buscarPorCpf(String cpf) {
        for (Student s : alunos) {
            if (s.getCpf().equals(cpf)) {
                return s;
            }
        }
        throw new StudentNotFoundException("Aluno com CPF " + cpf + " não encontrado.");
    }
    public boolean jaExisteCpf(String cpf) {
        for (Student s : alunos) {
            if (s.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }
}

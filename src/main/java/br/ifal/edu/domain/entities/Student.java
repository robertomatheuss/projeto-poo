package br.ifal.edu.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{

    protected List<Enrollment> enrollments;

    public Student(int cpf, String name, String email) {
        super(cpf, name, email);
        enrollments = new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estudante ");
        sb.append("\n  Nome: ").append(getName());
        sb.append("\n  CPF: ").append(getCpf());
        sb.append("\n  Email: ").append(getEmail());
        sb.append("\n  Cursando: ");
        for (Enrollment enrollment: enrollments){
            sb.append("\n   "+enrollment.getCourse().getTitle());
        }
        return sb.toString();
    }
}

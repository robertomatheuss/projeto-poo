package br.ifal.edu.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{

    private List<Enrollment> enrollments;

    public Student(String name, String email, String cpf) {
        super(name, email,cpf);
        enrollments = new ArrayList<>();
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void addEnrollment(Enrollment enrollment){
        this.enrollments.add(enrollment);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estudante ");
        sb.append(super.toString());
        sb.append("\n  Cursando: ");
        for (Enrollment enrollment: enrollments){
            sb.append("\n   "+enrollment.getCourse().getTitle());
        }
        return sb.toString();
    }
}

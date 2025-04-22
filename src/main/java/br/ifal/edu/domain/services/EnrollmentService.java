package br.ifal.edu.domain.services;

import br.ifal.edu.domain.entities.Course;
import br.ifal.edu.domain.entities.Enrollment;
import br.ifal.edu.domain.entities.StatusMateria;
import br.ifal.edu.domain.entities.Student;
import br.ifal.edu.domain.exceptions.StudentAlreadyEnrolledException;
import br.ifal.edu.domain.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {

    private final StudentService studentService;

    public EnrollmentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void enrollStudent(String cpf, Course course) {
        try {
            Student student = studentService.buscarPorCpf(cpf);

            for (Enrollment e : student.getEnrollments()) {
                if (e.getCourse().equals(course)) {
                    throw new StudentAlreadyEnrolledException(student.getName());
                }
            }

            Enrollment newEnrollment = new Enrollment(student, course, StatusMateria.PROGRESS);
            student.addEnrollment(newEnrollment);
            course.addEnrollment(newEnrollment);

            System.out.println("Aluno matriculado com sucesso.");

        } catch (StudentNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (StudentAlreadyEnrolledException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

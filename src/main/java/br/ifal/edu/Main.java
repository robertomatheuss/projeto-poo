package br.ifal.edu;

import br.ifal.edu.domain.entities.Course;
import br.ifal.edu.domain.entities.Student;
import br.ifal.edu.domain.entities.Teacher;
import br.ifal.edu.domain.services.EnrollmentService;
import br.ifal.edu.domain.services.StudentService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        System.out.println("Bem vindo ao sistema de cadastro de curso online e estudantes");
        while (opcao != 6) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Matricular aluno em curso");
            System.out.println("2 - Ver informações do aluno nos cursos");
            System.out.println("3 - Cadastrar professor em curso");
            System.out.println("4 - Ver onde cada professor está dando aula");
            System.out.println("5 - Ver informações de um curso");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1 -> {
                    }
                    case 2 -> {
                    }
                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> {
                    }
                    case 6 -> System.out.println("Encerrando o sistema. Até logo!");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            }catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
            }
        }

        scanner.close();
            /*                StudentService studentService = new StudentService();
        Student student = new Student("Rov","Carlo@sfs","15184854548");
        Student student2 = new Student("Ca","José@","15184854548");
        studentService.registerStudent(student);
        studentService.registerStudent(student2);

        Teacher teacher = new Teacher("Carlo","caleo@", "324");
        Course course = new Course("letras","Estudo sobre letras",teacher);

        new EnrollmentService(studentService).enrollStudent("48484162145",course);
        new EnrollmentService(studentService).enrollStudent("324",course);

        System.out.println(student);System.out.println(student2);
*/
    }
}
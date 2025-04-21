package br.ifal.edu;

import br.ifal.edu.domain.entities.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1232,"Carlo","carlo@gmail");
        Student student2 = new Student(849,"José","josé@gmail");

        System.out.println(student);System.out.println(student2);

    }
}
package br.ifal.edu.domain.entities;

public class Teacher extends User{
    private Course responsibleCourse;
//adicionar metodo que adiciona o curso que o professor ensina
    public Teacher(String name, String email,String cpf) {
        super(name,email,cpf);
    }

    public Course getResponsibleCourse() {
        return responsibleCourse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher ");
        sb.append(super.toString());
        sb.append("\n  Responsible Course: ").append(responsibleCourse);
        return sb.toString();
    }
}

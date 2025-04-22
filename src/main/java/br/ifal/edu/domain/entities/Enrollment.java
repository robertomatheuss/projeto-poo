package br.ifal.edu.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    private int id;
    private Student student;
    private Course course;
    private StatusMateria status;
    private List<Classroom> classroomsCompleted;

    public Enrollment(Student student, Course course, StatusMateria status) {
        this.student = student;
        this.course = course;
        this.status = status;
        this.classroomsCompleted = new ArrayList<>();
    }



    public double calculateProgress(){
           return (double) classroomsCompleted.size() /course.getClassrooms().size();
    }

    public void markClassAsCompleted(Classroom classroom){
        classroomsCompleted.add(classroom);
    }

    public int getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public StatusMateria getStatus() {
        return status;
    }

    public List<Classroom> getClassroomsCompleted() {
        return classroomsCompleted;
    }
}

package br.ifal.edu.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    //só pode ter um teacher
    private int id;
    private String title;
    private String description;
    private Teacher teacher;
    private List<Classroom> classrooms;
    private List<Enrollment> enrollments;

    public Course(String title, String description, Teacher teacher) {
        this.title = title;
        this.description = description;
        this.teacher = teacher;
        this.classrooms = new ArrayList<>();
        this.enrollments = new ArrayList<>();
    }

    public void addClass(Classroom classroom){
        classrooms.add(classroom);
    }

    public void addEnrollment(Enrollment enrollment){
        enrollments.add(enrollment);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", teacher=" + teacher +
                ", classrooms=" + classrooms +
                ", enrollments=" + enrollments +
                '}';
    }
}

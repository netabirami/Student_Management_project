package com.StartStep.Student_Management_Project.course_management;

import com.StartStep.Student_Management_Project.student_information_management.Student;

import java.util.List;

public class Course {
    private int id;
    private String name;
    private List<Student> students;

    private float grade;

    public Course(int id, String name, List<Student> students, float grade) {
        this.id = id;
        this.name = name;
        this.students = students;
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

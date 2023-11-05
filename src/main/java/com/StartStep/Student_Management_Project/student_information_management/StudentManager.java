package com.StartStep.Student_Management_Project.student_information_management;

import com.StartStep.Student_Management_Project.course_management.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {

    private List<Student> studentList = new ArrayList<Student>();

    public void addStudent(Student student) {
        studentList.add(student);

    }

    public Student getStudent(int studentId) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentId == studentList.get(i).getId()) {
                return studentList.get(i);
            }
        }
        return null;
    }

    public void removeStudent(int studentId) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentId == studentList.get(i).getId()) {
                studentList.remove(i);
            }
        }
    }

    public void updateStudent(int studentId, String name, List<Course> courses) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentId == studentList.get(i).getId()) {
                studentList.get(i).setName(name);
                studentList.get(i).setCourses(courses);
            }
        }
    }

    public void addGrading(int studentId, int courseId, float grade) {
        //find the student using studentId - done
        //find the course for the student using courseID
        //set the grade for the course
        for (int i = 0; i < studentList.size(); i++) {
            if (studentId == studentList.get(i).getId()) {
                List<Course> courses = studentList.get(i).getCourses();
                for (int j = 0; j < courses.size(); j++) {
                    if (courseId == courses.get(j).getId()) {
                        courses.get(j).setGrade(grade);
                    }
                }
            }
        }
    }

    public Course getCourse(int studentId, int courseId){
        //find student using studentID
        //find course for the student using courseID
        //return the course
        for (int i = 0; i < studentList.size(); i++) {
            if (studentId == studentList.get(i).getId()) {
                List<Course> courses = studentList.get(i).getCourses();
                for (int j = 0; j < courses.size(); j++) {
                    if (courseId == courses.get(j).getId()) {
                       return courses.get(j);

                    }
                }
            }
        }
        return null;
    }
    public void sortStudentByName (){
        studentList.sort(Comparator.comparing(Student::getName));
    }

    public void sortStudentById (){
        studentList.sort(Comparator.comparing(Student::getId
        ));
    }
}

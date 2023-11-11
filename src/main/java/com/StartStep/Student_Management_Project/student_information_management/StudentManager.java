package com.StartStep.Student_Management_Project.student_information_management;

import com.StartStep.Student_Management_Project.course_management.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {

    private List<Student> studentList = new ArrayList<Student>();

    public synchronized  void addStudent(Student student) {
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

    public synchronized void removeStudent(int studentId) {
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

    public synchronized void addGrade(int studentId, int courseId, float grade) {
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

    public synchronized Course getCourse(int studentId, int courseId){
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

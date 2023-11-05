package com.StartStep.Student_Management_Project;


import com.StartStep.Student_Management_Project.course_management.Course;
import com.StartStep.Student_Management_Project.student_information_management.Student;
import com.StartStep.Student_Management_Project.student_information_management.StudentManager;
import com.StartStep.Student_Management_Project.user_management.UserManager;

import java.util.List;
import java.util.Scanner;

public class StudentManagementProjectApplication {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        while (true) {
            System.out.println("Do you want to use user management ? please press 1 : ");
            System.out.println("Do you want to use student management ? please press 2 :");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Do you want to register or login ? please press 1 for register 2 for login");
                int input2 = scanner.nextInt();
                if (input2 == 1) {
                    System.out.println("Please enter your user name and password to register");
                    Scanner scanner1 = new Scanner(System.in);
                    String userName = scanner1.nextLine();
                    String userPassword = scanner1.nextLine();
                    userManager.register(userName, userPassword);
                } else if (input2 == 2) {
                    System.out.println("please enter your user name and password to login");
                    Scanner scanner2 = new Scanner(System.in);
                    String userName = scanner2.nextLine();
                    String userPassword = scanner2.nextLine();
                    userManager.login(userName, userPassword);
                }
            } else if (input == 2) {
                System.out.println("please enter the following action:\n 1 for Add Student\n, 2 for Get Student\n, 3 for remove Student\n, 4 for update Student\n,5 for Add Grade\n,6 for get Course ");
                Scanner scanner3 = new Scanner(System.in);
                int input3 = scanner3.nextInt();
                switch (input3) {
                    case 1:
                        Scanner scanner4 = new Scanner(System.in);
                        System.out.println("Please enter ID");
                        int id = scanner4.nextInt();
                        System.out.println("Please enter your Name");
                        String name = scanner4.nextLine();
                        System.out.println("please enter your course id");
                        int courseId = scanner4.nextInt();
                        System.out.println("please enter your course name");
                        String courseName = scanner4.nextLine();
                        studentManager.addStudent(
                                new Student(
                                        id, name,
                                        List.of(new Course(courseId, courseName, null, 0))
                                ));
                        System.out.println("Student added successfully.");
                        break;
                    case 2:
                        Scanner scanner5 = new Scanner(System.in);
                        System.out.println("Please enter student ID");
                        int studentId = scanner5.nextInt();
                        Student student = studentManager.getStudent(studentId);
                        System.out.println(student);
                        break;
                    case 3:
                        Scanner scanner6 = new Scanner(System.in);
                        System.out.println("Please enter student ID");
                        int studentId1 = scanner6.nextInt();
                        studentManager.removeStudent(studentId1);
                        System.out.println("Student removed successfully");
                        break;
                    case 4:
                        Scanner scanner7 = new Scanner(System.in);
                        System.out.println("Please enter ID");
                        int id1 = scanner7.nextInt();
                        System.out.println("Please enter your Name");
                        String name1 = scanner7.nextLine();
                        System.out.println("please enter your course id");
                        int courseId1 = scanner7.nextInt();
                        System.out.println("please enter your course name");
                        String courseName1 = scanner7.nextLine();
                        studentManager.updateStudent(
                                id1, name1,
                                List.of(new Course(courseId1, courseName1, null, 0))
                        );
                        break;
                }

            }
        }
    }
}

package com.StartStep.Student_Management_Project;


import com.StartStep.Student_Management_Project.user_management.UserManager;

import java.util.Scanner;

public class StudentManagementProjectApplication {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
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
            }
        }
    }
}

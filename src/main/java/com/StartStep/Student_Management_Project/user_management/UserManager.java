package com.StartStep.Student_Management_Project.user_management;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserManager {
    private Map<String, User> userLoginDetails = new HashMap<>();

    public void register(String userName, String role, String password) {
        User user = null;
        if (role.equals("Admin")) {
            user = new Admin(userName, password, UserRole.ADMIN);
        } else if (role.equals("Teacher")) {
            user = new Teacher(userName, password, UserRole.TEACHER);
        }
        userLoginDetails.put(userName, user);
    }

    public void login(String userName, String password) {
        String existingPassword = userLoginDetails.get(userName).getPassword();

        if (password.equals(existingPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}

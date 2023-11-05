package com.StartStep.Student_Management_Project.user_management;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserManager {
    private Map<String,String> userLoginDetails = new HashMap<>();

    public void register(String userName, String password) {
        userLoginDetails.put(userName,password);
    }

    public void login (String userName, String password){
       String existingPassword = userLoginDetails.get(userName);

        if (password.equals(existingPassword)){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Login failed");
        }
    }
}

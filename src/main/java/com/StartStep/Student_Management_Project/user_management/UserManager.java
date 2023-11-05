package com.StartStep.Student_Management_Project.user_management;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserManager {
    private Map<Integer,String> userLoginDetails = new HashMap<>();

    public void register(Integer userId , String password) {
        userLoginDetails.put(userId,password);
    }

    public void login (Integer userID, String password){
        //getting the password
        //if the password match's print login successful
        //if the password dos not match print the login is failed

       String existingPassword = userLoginDetails.get(userID);

        if (Objects.equals(password, existingPassword)){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Login failed");
        }
    }
}

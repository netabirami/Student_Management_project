package com.StartStep.Student_Management_Project.user_management;

public class User {
    private int id;
    private String name;
    private UserRole role;

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

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public User(int id, String name, UserRole role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}

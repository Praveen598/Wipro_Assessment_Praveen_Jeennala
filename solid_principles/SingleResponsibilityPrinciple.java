package com.simpleProject;

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

class PasswordManager {
    public void resetPassword(User user) {
        System.out.println("Resetting password for user: " + user.getUsername());
        System.out.println("Please enter your new password...");
        
    }
}


public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
      
        User user = new User("john_doe");

       
        PasswordManager manager = new PasswordManager();
        manager.resetPassword(user);
    }
}
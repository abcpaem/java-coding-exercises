package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String capitalizedWord = word.substring(0,1).toUpperCase() + word.substring(1);
        return capitalizedWord;
    }

    public String generateInitials(String firstName, String lastName) {
        String initials = firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return 0.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}

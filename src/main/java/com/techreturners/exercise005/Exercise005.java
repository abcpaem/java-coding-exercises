package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = input.toLowerCase().toCharArray();

        for (char c : chars)
        {
            alphabet = alphabet.replace(""+c, "");
        }

        return alphabet.isEmpty();
    }

}

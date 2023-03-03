package com.bhargab.learning;

public class Palindrom {

    public static void main(String[] args) {
        String value = "A";
        System.out.println(checkPalindrom(value));
    }

    public static boolean checkPalindrom(String value) {

        if (value == null || "".equals(value))  return false;

        value = value.toLowerCase(); 
        char c[] = value.toCharArray();

        //StringBuilder s = new StringBuilder(value);
        //s = s.reverse();
        //if (s.toString().equals(value.toString())) return true;
        
        boolean result = false;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == c[c.length-i-1]) result = true;
        }
        return result;
    }
}

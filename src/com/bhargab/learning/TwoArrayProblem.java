package com.bhargab.learning;

import java.util.HashMap;
import java.util.Map;

public class TwoArrayProblem {

    public static void main(String[] args) {
        System.out.println ("Hello World");

        //char[] array1 = new char[]{'a', 'b', 'c', 'x'};
        //char[] array2 = new char[]{'y', 'z', 'i'};

        char[] array1 = new char[]{'a', 1, 'c', 'x'};
        char[] array2 = new char[]{'y', 'y', 'r'};

        boolean result = checkArray(array1, array2);

        System.out.println(result);


    }

    private static boolean checkArray(char[] array1, char[] array2) {

        if (array1.length == 0 || array2.length == 0) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i< array1.length; i++) {
            map.put(array1[i], i);
        }
        for (int i = 0; i< array2.length; i++) {
            if (map.get(array2[i]) != null) {
                return true;
            }
        }
        return false;
    }
}

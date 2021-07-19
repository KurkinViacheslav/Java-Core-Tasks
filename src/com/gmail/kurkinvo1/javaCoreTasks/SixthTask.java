package com.gmail.kurkinvo1.javaCoreTasks;

public class SixthTask {

    public static boolean sixthTask(String string) {
        String intermediateString = string.replaceAll("\\W", "").toLowerCase();
        int length = 0;
        if (intermediateString.length()%2 == 0) {
            length = intermediateString.length()/2;
        } else {
            length = intermediateString.length()/2 + 1;
        }
        String halfString = intermediateString.substring(0, intermediateString.length()/2);
        String secondHalfString = intermediateString.substring(length);
        String reverseHalfString = new StringBuilder(secondHalfString).reverse().toString();

        return halfString.equals(reverseHalfString);
    }

}

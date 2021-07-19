package com.gmail.kurkinvo1.javaCoreTasks;

public class FifthTask {

    //The binary representation of number will have only one one-bit if that number is degree of two.
    public static boolean fifthTask(int number) {
        return 1 == Integer.bitCount(Math.abs(number));
    }

}

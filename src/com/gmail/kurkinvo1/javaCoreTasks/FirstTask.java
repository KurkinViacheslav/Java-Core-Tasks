package com.gmail.kurkinvo1.javaCoreTasks;

public class FirstTask {
    public static boolean firstTask(boolean first, boolean second, boolean third, boolean fourth) {

        return ((((first & second) ^ (third & fourth)) & !((first & third) | (second & fourth))) ^
                ((first ^ second) & (third ^ fourth)));

    }
}

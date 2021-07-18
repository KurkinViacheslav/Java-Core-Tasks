package com.gmail.kurkinvo1.javaCoreTasks;

public class Main {

    public static void main(String[] args) {

        boolean answer = FirstTask.firstTask(true, false, false, true);
        System.out.println("The answer is " + answer);

        int leapYears = SecondTask.secondTask(1655);
        System.out.println("Numbers of leap years: " + leapYears);
    }
}

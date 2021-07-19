package com.gmail.kurkinvo1.javaCoreTasks;

public class Main {

    public static void main(String[] args) {

        boolean answer = FirstTask.firstTask(true, false, true, true);
        System.out.println("The answer is " + answer);

        int leapYears = SecondTask.secondTask(1655);
        System.out.println("Numbers of leap years: " + leapYears);

        int changedNumber = ThirdTask.thirdTask(34, 5);
        System.out.println("The changed number is " + changedNumber);

        char shiftedChar = FourthTask.fourthTask('\\', 29);
        System.out.println("Shifted char is " + shiftedChar);

        boolean answ = FifthTask.fifthTask(127);
        System.out.println("The number is the degree of 2?    " + answ);
    }
}

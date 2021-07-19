package com.gmail.kurkinvo1.javaCoreTasks;

public class Main {

    public static void main(String[] args) {

        boolean answer1 = FirstTask.firstTask(true, false, true, true);
        System.out.println("The answer is " + answer1);

        int leapYears = SecondTask.secondTask(1655);
        System.out.println("Numbers of leap years: " + leapYears);

        int changedNumber = ThirdTask.thirdTask(34, 5);
        System.out.println("The changed number is " + changedNumber);

        char shiftedChar = FourthTask.fourthTask('\\', 29);
        System.out.println("Shifted char is " + shiftedChar);

        boolean answer5 = FifthTask.fifthTask(127);
        System.out.println("IS the number the degree of 2?  :  " + answer5);

        boolean answer6 = SixthTask.sixthTask("Was it a car or a cat I saw?");
        System.out.println("Is that String a polyndrome?  :  " + answer6);
    }
}

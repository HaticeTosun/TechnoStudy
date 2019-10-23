package day7;

import java.util.Scanner;

public class UserInputTask1 {

    public static void main(String[] args){
        //TODO Task 1:
        // Write a program that ask a number:
        // example:
        // Provide a number:
        // 3
        // Your number is 3


        Scanner sc1 = new Scanner(System.in);
        int i2 = sc1.nextInt();
        System.out.println("What your first number is : " + i2);

        //TODO Task 2:
        // Write a program that ask two number,
        // in your console it should print same as below:
        // Provide a first number:
        // 3
        // Your first number is 3
        // Provide a second number:
        // 5
        // Your second number is 5

        int i3 = sc1.nextInt();
        System.out.println("Provide a first number: " + i3);

        int i4 = sc1.nextInt();
        System.out.println("Provide a second number: " + i4);

        int sum = i3+i4;
        System.out.println("Sum is: " + sum);






    }
}

package day7;
// 1. write a program that prints word representation of your number
//      where number is 0 <= N <= 3
// ex: 0 => zero
// ex: 3 => three

// HW:2. write a program that prints number of word representation number
//     where number is 0 <= N <= 3
// ex: zero => 0
//     one => 1

import javax.swing.*;
import java.util.Scanner;

public class UserInputTask4 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number[0-3]: ");

        int number = scan.nextInt();
        if(number == 0){
            System.out.println("zero");
        }
        if(number == 1){
            System.out.println("One");
        }
        if(number == 2){
            System.out.println("Two");
        }
        if(number == 3){
            System.out.println("Three");
        }
        int age= 40;
        if (age <=30){
            System.out.println("you're still young");
        }
        else{
            System.out.println("you're not young");
        }

        int salary=50000;
        if(salary <= 20000) {
            System.out.println("you need governmental support");
        }
        else if(salary >=50000){
            System.out.println("it's cool");

        }
        else {
            System.out.println("you're happiest");
        }





    }
}

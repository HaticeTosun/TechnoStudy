package day7;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your name:  ");
        String name= scan.nextLine();
        System.out.println("Welcome " + name + "!!!");

        System.out.println("=====================");
        String s1 = scan.nextLine();
        System.out.println("Your text is here:   "+ s1);

        System.out.println("======================");



        Scanner sc = new Scanner(System.in);
        String s2 =sc.nextLine();
        System.out.println("Text is: "+ s2);
        int i1 = sc.nextInt();
        System.out.println("Integer is: "+ i1);
        System.out.println("==================================");









    }







}


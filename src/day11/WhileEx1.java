package day11;

import java.util.Scanner;

public class WhileEx1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Write a string");
            String s = scan.nextLine();

            while (!s.equals("o")) { //s != "exit"
                System.out.println("Write a string");
                s = scan.nextLine();
            }
        }

    }

package day11;

import java.util.Scanner;

public class WhileTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a string");
        String s = scan.nextLine();

        while (!s.equals("Quit")) { //s != "Quit"
            System.out.println("Write a string");
            s = scan.nextLine();
        }
    }
}

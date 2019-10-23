package day6;

public class StringSubstrings {
    public static void main(String[] args) {

        String string1 = "Hello World";
        System.out.println(string1.substring(6));//World

        System.out.println(string1.substring(0, 1));
        System.out.println(string1.substring(6, 7));
        System.out.println(string1.substring(3, 7));
        System.out.println(string1.substring(0, 10));
        System.out.println(string1.substring(11, 11));
        System.out.println(string1.substring(0, 0));
        System.out.println(string1.substring(0, 5));

        System.out.println("Ex1==============================");


        String string2 = "Michael";
        String string3 = "Jackson";
        System.out.println(string2.substring(0, 1) + string3.substring(0, 1));


        System.out.println("Ex2==============================");


        String fullname = "Michael Jackson";
        String a = fullname.substring(0, 1);
        String b = fullname.substring(8, 9);
        System.out.println(a + b);

        System.out.println("Ex3==============================");
//Task 1:
        // write a program that prints your initials
        // ex: Michale Jackson => MJ
        String fullname1 = "Michale Jackson";
        String ac = fullname1.substring(0, 1);
        String bc = fullname1.substring(8, 9);
        System.out.println(ac + bc);

        //Task 2: continue "task 1" but print this:
        // ex: Michale Jackson => M.J.
        String dot = ".";
        System.out.println(a + dot + b + dot);

        //Task 3: Write a Java program to get a substring
        //        of a given string between two specified positions
        //given string: "The quick brown fox jumps over the lazy dog."
        //print only this:   "brown fox jumps"

        String s1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(s1.substring(10, 25));
    }






}

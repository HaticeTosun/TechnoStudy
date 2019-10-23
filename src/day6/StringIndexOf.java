package day6;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class StringIndexOf {

    public static void main(String[]args){


        //Searching inStrings With indexOf()
        //01234

        String s1="Hello";
        System.out.println(s1.indexOf("ello"));


        System.out.println("Ex2=============================");

        String S2="Techno Study";
        int indexS2 =S2.indexOf("ech");

        System.out.println(indexS2);


        System.out.println("Ex3===========================");
        //Last indexOf get last occurrence of your searching string
        String S3="so something so many";
        int indexS3= S3.lastIndexOf("so");
        System.out.println(indexS3);

        //Task 1:
        String str="techno";//=> 6+1 => 7
        //hint:length(), indexOf()
        int length=str.length();
        int index = str.indexOf("e");
        int sum = length + index;
        System.out.println(sum);


        System.out.println("Ex4===========================");




    }
}

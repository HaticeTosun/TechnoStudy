package day19_HashSet;

import java.util.ArrayList;

public class ArrayListTask1 {

    // 1. write a java program to create a new array list,
    // add some colours (string)and print  out the collection.
    public static void main(String[] args) {
        ArrayList<String > arr = new ArrayList<>();
        arr.add("\nGreen");
        arr.add("\nBlue");
        arr.add("\nRed");
        arr.add("\nOrange");
        arr.add("\nBlack");
        arr.add("\nWhite");
        System.out.println(arr);
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
        }
        System.out.println();


        }




    }



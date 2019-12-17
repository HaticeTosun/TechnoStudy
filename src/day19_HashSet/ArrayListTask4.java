package day19_HashSet;

import java.util.ArrayList;

public class ArrayListTask4 {
    public static void main(String[] args) {
        //4. Write a Java program to retrieve an element
        // (at a specified index) from a given array list.

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red"); //0
        colors.add("White");//1
        colors.add("Black");//2
        colors.add("Green");//3
        System.out.println(colors);

        //write you code here
        //Hint: print third element in arrayList.
        // Black => Blue
        System.out.println("third element in arrayList: " + colors.get(2));

        colors.set(2,"blue");
        System.out.println(colors);

        colors.remove(1);
        colors.add(1,"Black");

        System.out.println(colors);





    }
}

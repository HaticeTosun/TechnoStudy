package day19_HashSet;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListTask9 {
    //9. Write a Java program to copy one array list into another.
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red"); // 0
        list1.add("White");// 1
        list1.add("Black"); // 2
        list1.add("Green");
        System.out.println("List 1: "+list1);

        ArrayList<String> list2 = new ArrayList<>();
        // write code here
        System.out.println("1. way");
        //Hint use loop and .get(), add()methods
        for (String element:list1){
            list2.add(element);
        }
        System.out.println("2. way");

        System.out.println("3. way");
        System.out.println("4. way bad way, don't do that");

        // end of code
        System.out.println("List 2: "+list2);
    }
}

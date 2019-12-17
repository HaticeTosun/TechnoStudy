package day19_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class JavaSetTask2 {
    public static void main(String[] args) {
        //2. Write a Java program to iterate through all elements in a hash list.

            HashSet<Integer> numbers = new HashSet<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(10);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);
            System.out.println(numbers);

        for (Integer setNumber: numbers);
        System.out.println(numbers);

       for (Integer number :numbers){
           System.out.println(number);
       }
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            Integer number = iterator.next();
//            System.out.println(number);
//        }
        Iterator<Integer> iterator= numbers.iterator();
       while (iterator.hasNext()){
           Integer number = iterator.next();
           System.out.println(number);
       }

    }
}

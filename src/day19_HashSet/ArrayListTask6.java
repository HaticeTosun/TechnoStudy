package day19_HashSet;

import java.util.ArrayList;

public class ArrayListTask6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red"); // 0
        colors.add("White");// 1
        colors.add("Black"); // 2
        colors.add("Green"); // 3
        System.out.println(colors);

        System.out.println("1. way");
        colors.remove(2);
        System.out.println(colors);

        System.out.println("2. way");
        colors.remove("Black");
        colors.remove("Red");
        colors.remove("Green");

        System.out.println(colors);

    }


}

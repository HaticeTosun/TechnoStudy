package day6;

public class ConvertingStringToIntegerAndViceVersa {
    public static void main(String[] args){
        int number= 10;
        String s1= String.valueOf(number);
        System.out.println(s1+10);
        System.out.println("10"+10);
        System.out.println("=============================");

        //Converting String to integer

        String s2 ="30";
        int n2 =Integer.valueOf(s2);
        //30+10=>40

        System.out.println(s2+10);
        System.out.println(n2+10);
        System.out.println("==============================");

        String S1 ="100";
        String S2 ="400";

        int n3 =Integer.valueOf(S2);
        int n4 =Integer.valueOf(S1);
        System.out.println(n3+n4);
        System.out.println("==============================");


        String S3= "5";
        String S4= "22";
        double d1=50;
        double d2=2.24;
        double d3=50000;

        double n5 =Integer.valueOf(S3);
        double n6 =Integer.valueOf(S4);

        double average =(n5+n6+d1+d2+d3);

        System.out.println(average);

        //TODO Task 2: write a program that
        // take this values and prints the average
        // values = ["5", 50, 2.24, "22", 50000];
        String v1 = "5";
        int v2 = 50;
        double v3 = 2.24;
        String v4 = "22";
        int v5 = 50000;

        String v6 = "22.234234";
        Double.valueOf(v6);

        double average1 = (Integer.valueOf(v1) + v2 + v3 + Integer.valueOf(v4) + v5) / 5;
        System.out.println(average);

















    }

}

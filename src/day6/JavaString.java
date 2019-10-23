package day6;

public class JavaString {
    public static void main(String[]args){

        String s1 ="hello1";
        String s2 ="hello1";
        String s3 ="hello1";

        if(s1==s2){
            System.out.println("it's equal");

        }
        String s6= new String("asd");
        String s4= new String("ABC");
        String s5= new String("ABC");
        if(s4==s5){
            System.out.println("it's equal again");

        }
        if (s4.equals(s5)){
            System.out.println("it's equal again");
        }





    }

}

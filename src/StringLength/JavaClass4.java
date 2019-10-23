package StringLength;

public class JavaClass4 {
    public static void main(String[]args){

        //String Length

        String s1 = "ABCDE";
        System.out.println(s1.length());

        int l = s1.length();
        System.out.println(l);

        String username ="techno.study";

        if (username.length()<10){
            System.out.println("You can login");
        }
        if (username.length()>=10) {
            System.out.println("You can not login");
        }

        String s2 ="Hello";
        String s3 ="World";

        int l1 = s2.length();
        int l2 = s3.length();
        int lresult = s2.length()+s3.length();
        //Way 1
        System.out.println("Length is :" + lresult);

        String a1="Hello";
        String a2="Universe!!!";
        System.out.println("length is"+(a1+a2).length());
        //Way2

        System.out.println(a1.length()+a2.length());

        int lengthA1 = a1.length();
        int lengthA2 = a2.length();
        int sum = lengthA1+lengthA2;
        //Way 3
        System.out.println("Length is"+ sum);


        String c1 ="LongStringHere";
        String c2 ="ShortOne";

        int lengthC1= c1.length();
        int lengthC2= c2.length();
        int subtraction = lengthC1 - lengthC2;


        if (subtraction< 0){
            System.out.println("You can not proceed");

        }else {//subtraction >=0
            System.out.println("We can do it");
        }















    }

}

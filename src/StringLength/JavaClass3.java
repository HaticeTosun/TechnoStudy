package StringLength;

public class JavaClass3 {
    public static void main(String[]args){
        // Concatenating Strings
        String s1 ="Hello ";
        String s2 ="World!!!";
        String a3 ="YES";

        System.out.println(s1+s2);
        System.out.println(s1.concat(s2).concat(a3));
        //


        String s3 = "What ";
        String s4 = "is ";
        String s5= "your ";
        String s6 = "name? ";
        System.out.println(s3 + s4 + s5+ s6);

       String space="\n";



        System.out.println(s1+ s2 + s3 + s4 + s5+ s6);
        System.out.println(s1+ space +s2 + space + s3 + space+ s4+ space + s5+ space + s6+ space);
        System.out.println("A\nB\nC\nD\nE\nF\n");




    }
}

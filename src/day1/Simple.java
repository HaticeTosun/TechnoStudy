package day1;

public class Simple {

    public static void main(String[] args) {

        String a = "10";

        String b = "10";

        String c = a + " space " + b;

        System.out.println(c);
    }
}


class Simple2 {
    public static void main(String[] args) {
        int a = 10;

        float f = a;

        System.out.println(a);

        System.out.println(f);



    }
}
class Simple3{
    public static void main(String[]args){

        float f = 10.5f;
        //int a=f;// Compile time error
        int a= (int)f;
    }
}
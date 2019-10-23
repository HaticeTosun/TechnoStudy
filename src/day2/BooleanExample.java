package day2;

public class BooleanExample {
    public static void main(String[] args) {

        boolean falseBool = false;
        boolean trueBool = true;

        // int a = 20;
        // int b= 10;
        // int c = a+b;

        System.out.println(trueBool&&trueBool);

        System.out.println("true && true=> " + (trueBool&&trueBool));


        System.out.println(falseBool && trueBool);


        System.out.println(trueBool && falseBool);


        System.out.println(falseBool && falseBool);


        System.out.println();
        System.out.println(true&&true);

        System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);
//==============================================================
        System.out.println(true||true);
        System.out.println(false||true);
        System.out.println(true||false);
        System.out.println(false||false);



        System.out.println("true || true=> " + (trueBool||trueBool));


        System.out.println("false || true=> "+(falseBool || trueBool));



        System.out.println("true || false => "+(trueBool || falseBool));


        System.out.println("false || false=> " +(falseBool || falseBool));

        System.out.println(true&&true||false&&false);
        System.out.println(true&&(true||false)&&(false||true)&&true||false||true||false);







    }

    

}

package officeHours;

public class OfficeHour1 {
    public static void main (String[] args){
        //don' use keywords whic is taken by java
        //example: int final =11; will not work
        // java is key sensitive uppercase and lower case are matter
        int i1 =11;
        int i2 =20;

        int result = i1+i2;

        System.out.println("Result1 is here"+result);

        int i3 = 100;
        int i4 = 200;

        int result2 = i3-i4;

        System.out.println("Result2 is here line 20-> "+result2);

        int i5 =200;//int is used for whole numbers
        double d1 =200;//double is for the decimal numbers

        double d2 =300;

        double result3= d1/d2;// if you are working with double your result variable type

        System.out.println("result3 is here-> "+result3);


        double d3 =10;

        double d4 =20;

        double result4 =d3 *d4;

        System.out.println("result4 is here->" +result4);

        System.out.println("----------------------------- ---------------------------");

        int i6 = 25;

        int i7 = 7;
        //how percentage sign works in the background
        // 7+7+7=21
        //         25-21= 4 (remains 4)

        int result5 = i6% i7;

        System.out.println("result5 is here->" +result5);

        int i8 =100;
        int discount =50;

        int result6 = i8%discount;
        //50+50 =100
        //100-100=0

        System.out.println("result6 is here ->" +result6);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 is here ->" +b1);

        //int i8 =100;
        //int discount =50;
        boolean b3 = i8> discount;

        System.out.println("b3 is here ->" +b3);

        int in1 = 14;
        int in2 = 4;

        int result7 = in1%in2;

        //== is checking is the result 7 equal to 2 if yes it stores true to b4 if no stores false to b4

        boolean b4= result7==0;

        System.out.println("b4 is here ->" +b4);

        double d5 = 120;
        double d6 = 10;

        double result8= d5 * d6;
        boolean b5 = result8 > 2000;

        boolean b6 = d5 * d6 > 2000;
        System.out.println("b5 is here ->" +b5);

        System.out.println("b6 is here ->" +b6);


        System.out.println("-----------------------------");

        char c1 ='a';
        char c2='2';
        char c3 ='/';
        char c4 = '*';

        System.out.println("-----------------------------");

        int in6 =10;

        int in7=20;
        int result9= in6+in7;

        System.out.println("result9 is here ->" +result9);

        in6= 30;
        result9=in6 +in7;

        System.out.println("result9 is here ->" +result9);

        System.out.println(in6 + " " +in7);

        System.out.println("in6 is here= "+in6+" "+ "in7 is here =" +in7);

        System.out.println(" "+ in6 +in7);






























    }
}

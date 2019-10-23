package day7;

public class MathRandom2 {

    //To get random number between 0 and N, multiply Math.random() with N
//formula: Math.random()*N, where N is integer


        //Task2: print 2 random numbers between 0 and 10;
        //ex1:
        //    4
        //    5
        //ex2:
        //    1
        //    2

    public static void main(String[] args) {
        double d1 = Math.random();
        System.out.println(d1);
        System.out.println(d1 * 10);
        int i1 = (int) (d1 * 10);
        System.out.println(i1);

        System.out.println("---------------");
        //0 - 1000
        System.out.println((Math.random()*1000));

        //sample
        // 0.2 * 10 => 2
        //

    }



}

package day2;

public class IfStatement {
    public static void main(String[] args) {
        boolean statement = false;
        if (statement) {
            System.out.println("statement is true");

        }
        int year =1901;
        if(year>=2000){
            System.out.println("it's 20th century");
        }
        if (year==2000){
            System.out.println("it's millennium");
        }
        if(year<2000){
            System.out.println("it's 19th century");
        }

        int temperature =70;

        if (temperature>=70){
            System.out.println("it's hot");
        }
        if (temperature <70 && temperature>=60){
            System.out.println("it's warm");
        }
        if (temperature <60 && temperature>=20){
            System.out.println("it's cool");
        }

        if (temperature <20){
            System.out.println("it's Freezing");
        }

        int temperature1 = -100;

        if (temperature1>=70){
            System.out.println("it's hot");
        }
        if (temperature1 <70 && temperature1>=60){
            System.out.println("it's warm");
        }
        if (temperature1 <60 && temperature1>=20){
            System.out.println("it's cool");
        }

        if (temperature1 <20){
            System.out.println("it's Freezing");
        }

        int temperature2 = 45;

        if (temperature2>=70){
            System.out.println("it's hot");
        }
        if (temperature2 <70 && temperature2>=60){
            System.out.println("it's warm");
        }
        if (temperature2 <60 && temperature2>=20){
            System.out.println("it's cool");
        }

        if (temperature2 <20){
            System.out.println("it's Freezing");
        }
        int mark =65;
        if (mark == 50 ){
            System.out.println("avarage");
        }
        if (mark <50){
            System.out.println("failed)");
        }
        if (mark>=51&& mark <80){
            System.out.println("Success");
        }

        if(mark>=80&& mark <=100){
            System.out.println("MERIT");
        }





    }
}
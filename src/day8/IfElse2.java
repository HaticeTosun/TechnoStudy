package day8;

public class IfElse2 {
    public static void main(String[] args){
        String s1= "Hello";

        if(s1.length()==5){
            System.out.println("Password is strong");
        }
        else if (s1.contains("o")){
            System.out.println("it has o");
        }
        else {
            System.out.println("ignore this");
        }
        System.out.println("end");


        int number = 10;

        if(number > 5){
            System.out.println("Number is bigger that 5");
        }
        if(number > 3){
            System.out.println("Number is bigger that 3");
        }


        int number1 = 10;

        if(number1 > 5){
            System.out.println("Number is bigger than 5");
        }
        else if(number1 > 3){
            System.out.println("Number is bigger than 3");
        }

        else{
            System.out.println("Number is less than 3");
        }




    }
}

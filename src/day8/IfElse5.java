package day8;

import java.util.Scanner;

    public class IfElse5 {

        public static void main(String[] args) {

                // byte -127 <-> 128
                // write a program check what
                // number DataType it is?
                // use scanner and if-else statements
                // 23 => byte
                // 12312 => int
                // 123123123 => long
                // TODO
                //  HINT: byte < short < int < long


                    Scanner scan = new Scanner(System.in);

                    System.out.println("Write a number please:");
                    long number = scan.nextLong();

                    if(number >= -128 && number <= 127){
                        System.out.println("DataType is byte");
                    }else if (number>=-32768  && number <=32767) {
                        System.out.println("Data type is short");
                    }
                    else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE){
                        System.out.println("Data type is int");
                    } else if (number >= -9.223372036854775808 && number <= 9.223372036854775807);
                        System.out.println("Data type is long");

                }
            }



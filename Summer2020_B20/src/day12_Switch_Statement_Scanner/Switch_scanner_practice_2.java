package day12_Switch_Statement_Scanner;
/*
 write a program that can ask youser to enter two number, and the prints the sum of those two number
            Enter your first number
            10
            Enter your second number

 */


import java.util.Scanner;

public class Switch_scanner_practice_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter your first number");


        int num1 =scan.nextInt();
        System.out.println("Enter your second number" );
        int num2 = scan.nextInt();
        System.out.println("result = "+ (num1+num2));







    }












}

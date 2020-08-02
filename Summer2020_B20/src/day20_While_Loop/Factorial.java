package day20_While_Loop;

import java.util.Scanner;

/*
Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2 * 1
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter Your Number : ");
        int num=scan.nextInt();
        int result = 1;
        for (int i = num; i > 0 ; i--){

            result *=i;
        }
        System.out.println( "Factorial Number : " + result);


    }
}

package day21_loops;
/*
1. write a program that asks user to enter 5 numbers and retuns the maximum number

	2. write a program that asks user to enter 5 numbers and returns the minimum number
 */
import java.util.Scanner;

public class Max_Min_Number {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int max=-2147483648;
        int min= 99999999;
        for (int i = 1 ; i<=5 ; i++){
            System.out.println("Enter your Number :");
            int num=scan.nextInt();

            if (num > max){
                max=num;
            }
            if (num < min) {
                min = num;
            }

        }
        System.out.println("Max Number : "+ max);
        System.out.println("======================================================");
        System.out.println("Min NUmber is: "+min);






    }
}

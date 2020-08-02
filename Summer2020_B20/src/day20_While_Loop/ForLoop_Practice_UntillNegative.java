package day20_While_Loop;

import java.util.Scanner;

/*
Write a program that calculates the sum of numbers entered by the user
until user enters a negative number.
            hint
 */
public class ForLoop_Practice_UntillNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int sum =0;
        for (int i = 1 ; i == 1;){

            System.out.println("enter number :");
            int num =scan.nextInt();
            if (num<0){
                break;
            }
                 sum+=num;
        }

        System.out.println(" Sum of number is : "+sum);

    }
}

package OfficeHours.Practice_07_08_2020;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -9999999;
/*
        for (int i=0 ; i<=5 ; i++){
            System.out.println("Enter a number :");
            int num=scan.nextInt();

            if (num>max){
                max = num;
            }

        }
        System.out.println("maximun number is : "+max);
        */

        System.out.println("========================================================");

        int j = 1;
        while (j <= 5) {
            System.out.println("Enter a number :");
            int num = scan.nextInt();
            if (num > max) {
                max = num;
            }
            j++;
        }System.out.println("maximun number is : "+max);


    }

}
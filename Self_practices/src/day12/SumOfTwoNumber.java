package day12;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" Enter your first number : ");
        int num1= input.nextInt();
        System.out.println("Enter your second number :");
        int num2= input.nextInt();
        int sum= num1+num2;
        System.out.println("sum of two number = "+ sum);
    }
}

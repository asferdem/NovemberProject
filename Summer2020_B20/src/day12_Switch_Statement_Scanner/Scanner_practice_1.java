package day12_Switch_Statement_Scanner;


import java.util.Scanner;

public class Scanner_practice_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        double num = scan.nextDouble();
        String result = (num%2==0) ?  num +" is Even Number ": num+" is odd Number";
        System.out.println(result);







    }
}

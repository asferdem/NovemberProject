package day29_CustomMethads;

import java.util.Scanner;

public class MethodsWithParameters {

    public static void main(String[] args) {
        printHello(5);
        System.out.println("=======================");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Birth year and current year");

        age(scan.nextInt(),scan.nextInt());
    }




    public  static void printHello(int numberOfTimes){

        for (int i=0 ; i<numberOfTimes;i++){
            System.out.println("Hello World");
        }
    }

    public static void age(int birthYear,int currentYear){
        if (currentYear<birthYear){
            System.out.println("invalid Entry");
        }else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }
    }



}

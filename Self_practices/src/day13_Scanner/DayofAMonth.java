package day13_Scanner;

import java.util.Scanner;
/*
Write a program that asks user to enter the month number and returns
the number of days in given month month (Assume that Feb has 28 days)

				30 days: 4,6,9,11
				31 days: 1,3,5,7,8,10,12


	   			MUST use Scanner and nested IF
 */
public class DayofAMonth {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your month number : ");
        int number=input.nextInt();
        if(number>=1 && number<=12){
            if(number==2){
                System.out.println("28 Days");
            }else if (number==4||number==6||number==9||number==11){
                System.out.println("30 Days");
            }else{
                System.out.println("31 Days");
            }




        }else {
            System.out.println("invalid number");

        }
    }
}

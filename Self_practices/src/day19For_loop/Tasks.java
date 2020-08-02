package day19For_loop;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
write a program that can print the numbers between 1 to 100.
                if the number is divivible by 3, do not print it
 */
public class Tasks {
    public static void main(String[] args) {

        for (int i = 1; i<=100;i++){

            if (i %3==0) {
               continue;
            }
                System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("==========================================");
        /*
        write a program that can ask the user enter a number for five times
        and the returns the sum of those five numbers
         */
        Scanner scan =new Scanner(System.in);
        int sum =0;
        for (int i =1; i <=5;i++){
            System.out.println("enter yor number :");
            int n=scan.nextInt();
            sum +=n ;


        }
        System.out.println("Sum of nember : "+sum);

/*
 Write a program that calculates the sum of numbers entered by the user until user
 enters a negative number.
            hint: you need an infinite loop
 */
       /*int  sum1=0;

               for(int i2 =1 ; i2>0;i2++){

              System.out.println("Enter Your Number:");
              int num=scan.nextInt();

              if (i2 <0){
                  break;
              }else{
                  sum1+=num;
                  System.out.println("Sum of Number : "+sum1);

                break;
              }

          }
*/




    }
}

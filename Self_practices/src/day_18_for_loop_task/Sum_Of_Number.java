package day_18_for_loop_task;

import java.util.Scanner;

public class Sum_Of_Number {
    public static void main(String[] args) {

        int sum=0;
        for ( int i= 1 ; i <= 100 ; i++){
            sum +=i;

            }
        System.out.println("Sum Of Number :"+ sum);
        System.out.println("=============================================");

        int sum1=0;
        int a2 = 50;
        for (int a1=1; a1<=a2;++a1){
            sum1 +=a1;
        }
        System.out.println(sum1);
        System.out.println("=================================================");
        int sum2=0;
        int sum3 = 0;
        for (int num=1;num<=100;++num){
            if (num%2==0){
                sum2=sum2+num;

            }else{
                sum3=sum3+num;

            }

        }
        System.out.println("Sum Of Even Number:"+sum2);
        System.out.println("Sum Of Odd Number:"+sum3);


    }
}

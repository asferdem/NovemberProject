package day19_For_Loop_break;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
6. Write a program that will print out all letters in English alphabet in descedning order
    7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
 */
public class SumOfNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "Enter your number : ");
        int num = scan.nextInt();
        int sum = 0 ;
        if (num>0){
            for (int i =1 ; i <=num ; i++){
                sum += i;

            }
            System.out.println(sum);

        }else {
            System.out.println(" Invalid Entry");
        }






    }
}

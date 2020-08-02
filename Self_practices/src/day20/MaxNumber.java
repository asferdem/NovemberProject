package day20;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int max= 0;
        int i = 1;

       for (i=1;i <=5;i++) {
            System.out.println("Enter your number");
            int num = scan.nextInt();

            if (max < num) {
                max = num;

            }

        }

        System.out.println("Maximum number is : "+max);
        System.out.println("==================================================");
        int min =0;
        int b= 5;
        for (b=5 ; b>= 1 ;b--){
            System.out.println("Enter your Number : ");
            int num1=scan.nextInt();

            if (min>num1){
                min=num1;
            }
        }
        System.out.println("Your min number is : "+min);







    }
}

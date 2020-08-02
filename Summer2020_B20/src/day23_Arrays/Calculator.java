package day23_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println(" Enter two number :");
            double num1=scan.nextDouble();
            double num2=scan.nextDouble();
            System.out.println("Enter the math operator");
            char o=scan.next().charAt(0);


            double result = (o == '+') ? num1+num2 :(o == '-' ) ? num1-num2 :
                         ( o == '*')? num1*num2 :( o == '/') ? num1/num2 :
                                 (o == '%') ? num1 % num2 : 0;


            System.out.println(result);
            System.out.println("Do you want to continue ?");
            String a= scan.next();// add .toLowerCase

            while( !(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no")) ){
                System.out.println("Invalid Answer,Please yes or no");
                System.out.println("Do you want to continue ?");
                a=scan.next();
            }

            if (a.equalsIgnoreCase("no")){
                break;
            }

        }






    }
}

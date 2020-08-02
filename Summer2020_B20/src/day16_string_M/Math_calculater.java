package day16_string_M;

import java.util.Scanner;

/*
write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %

 */
public class Math_calculater {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number :");
        double num1=scan.nextDouble();
        System.out.println("Enter second number");
        double num2=scan.nextDouble();

        System.out.println("Enter your math operator :");
        char op =scan.next().charAt(0);//char operator =    scan.next().charAt(0);

        boolean valid=op=='*' || op== '/'||op=='%'||op=='+'||op=='-';

        if (valid){
            switch (op){
                case'*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case'%':
                    System.out.println(num1%num2);
                    break;
                case'+':

                    System.out.println(num1+num2);
                    break;
                default:
                    System.out.println(num1-num2);
            }


        }else {
            System.out.println("invalid operator");
        }





    }
}

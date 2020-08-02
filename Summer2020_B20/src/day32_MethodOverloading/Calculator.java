package day32_MethodOverloading;

import java.util.Scanner;

/*
2. write a return method that accepts two numbers and an operator, then returns calculation result.
     if the operator is invalid, return zero otherwise return the result
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first Number :");
        double firstNum=scan.nextDouble();
        System.out.println("Operator: ");
        char op=scan.next().charAt(0);
        System.out.println("Enter second Number :");
        double secondNum=scan.nextDouble();

        double result =calculator(firstNum,op,secondNum);
        System.out.println("The result is : "+result);

    }






    public static double calculator(double num1,char op,double num2){

        double result= (op== '+') ? num1+num2: (op=='-')? num1+-num2: (op == '*') ? num1*num2
                      :(op=='/') ? num1/ num2 : (op=='%')? num1%num2 : 0;

        return result;

    }


}

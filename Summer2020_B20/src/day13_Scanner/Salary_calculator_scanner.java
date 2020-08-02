package day13_Scanner;
/*
write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class Salary_calculator_scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Annual Salary :");
        int annualSalary = input.nextInt();
        System.out.println("Enter your State tax rate : ");
        double stateTaxRate = input.nextDouble();
        double stateTax =stateTaxRate*annualSalary;

        System.out.println("Enter your Federal tax rate : ");
        double federalTaxRate = input.nextDouble();
        double federalTax = annualSalary*federalTaxRate;

        double afterTaxSalary= annualSalary-(federalTax+stateTax);
        System.out.println("Your Salary : $"+ annualSalary );
        System.out.println("Your State Tax : $"+ stateTax);
        System.out.println("Your Federal Tax : $"+ federalTax);
        System.out.println("Your salary after Tax : $"+ afterTaxSalary);

input.close();


    }
}

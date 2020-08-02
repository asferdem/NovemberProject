package day13_Scanner;
/*
write a program that can calculate the tax based on the annual salary
					1. ask the user enter the annual salary
					2. ask user to enter the full name
					3. ask user enter marrid status (use nextBoolean() method this time)

					assume that the normal tax rate for a person is set to 25 %. if he/she is married tax rate will be set to 20%

					the program should display all the informations in teh output
 */
import java.util.Scanner;

public class Calculate_salary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter your salary : ");
        double annualSalary=scan.nextDouble() ;
        scan.nextLine();
        System.out.println(" Enter Your Full Name :");
        String fullName=scan.nextLine();
        System.out.println("Enter Your Married Status True or false :");
        boolean marriedStatus= scan.nextBoolean();
        double tax1 = annualSalary* 0.25;
        double tax2= annualSalary*0.20;
        double salary1= 0;
        if (marriedStatus=true){
           salary1=annualSalary-tax2;

        }else{
          salary1=annualSalary-tax1;

        }
        System.out.println(fullName);
        System.out.println("Your Annual Salary is; "+ annualSalary);
        System.out.println("Your Tax : "+ tax1+" USD");
        System.out.println("you Are Maried : "+ marriedStatus);
        System.out.println("Your after tax salary is : "+ salary1);


    }
}

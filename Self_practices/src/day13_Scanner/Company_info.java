package day13_Scanner;
/*
write a program that asks the user enter the:
					1. company name
					2. first name
					3. last name
					4. Job title
					5. salary
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class Company_info {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your company name : ");
        String  company = scan.nextLine();

        System.out.println("Enter your first name : ");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name : ");
        String lastName = scan.nextLine();

        System.out.println("Enter your Jop Title : ");
        String title = scan.nextLine();

        System.out.println("Enter your Salary : ");
        Double salary= scan.nextDouble();
        System.out.println(company);
        System.out.println(firstName +" "+lastName);
        System.out.println(title);
        System.out.println(salary+ " USD");

    }
}

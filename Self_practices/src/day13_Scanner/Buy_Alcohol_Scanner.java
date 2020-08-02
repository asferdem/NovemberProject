package day13_Scanner;
/*
write a program that asked the user enter the age and based
on the input the program should be able to check
if the person is eligible to buy alcohol

	   			if age is > 21 , print "here is your wine"
	   			if age is < 21, print "get out kid"
	   			if age is invalid, print "Invalid Entry"


	   			MUST use Scanner and nested IF
 */
import java.util.Scanner;

public class Buy_Alcohol_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age= scan.nextInt();
        if(age>0 && age<=100){
            if(age>=21) {
                System.out.println("Here is your vine");
            }else{
                System.out.println(" Get out Kids ");
            }

        }else{
            System.out.println("invalid Entry");

        }

    }
}

package day13_Scanner;
/*
write a program that asks the user enter his car info:
							brand
							model
							year
							color
							mileage
							price

				ex: output format should be:
                  	  2012 Toyota Corolla white, 120000 miles, 12000 dollars
 */
import java.util.Scanner;

public class Task1_Nextline_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your car brand : ");
        String brand =scan.nextLine();

        System.out.println("Enter  model: ");
        String model = scan.nextLine();

        System.out.println("Enter year: ");
        int year =scan.nextInt();

        System.out.println("Enter color: ");
        String color = scan.nextLine();
        scan.nextLine();

        System.out.println("Enter milage : ");
        int milage = scan.nextInt();

        System.out.println("Enter your Price: ");
        double price =scan.nextDouble();

        System.out.println(year+" "+brand+" "+model+ color+ ","+ " "+ milage+" miles,"+ price+" dollars");

    }
}

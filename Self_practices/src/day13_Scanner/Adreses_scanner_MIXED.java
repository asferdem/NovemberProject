package day13_Scanner;
/*
write a program that asks the user to enter:
						1. building number
						2. street name (assume it has one word only)
						3. road name (assume it has one word only)
						4. city name (assume it has one word only)
						5. state
						6. zipcode

			and then print out the full address

				ex:
					input:
							7925
							JonesBranch
							Dr
							McLean
							VA
							22000

					output:
						addrees:	7925 JonesBranch Dr, McLean VA, 22000
 */
import java.util.Scanner;

public class Adreses_scanner_MIXED {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your building number : ");
        int building = input.nextInt();
        System.out.println("Enter your street name : ");
        String street= input.next();

        System.out.println("Enter your road name : ");
        String roadName= input.next();
        System.out.println("Enter your city name : ");
        String city=input.next();
        input.nextLine();
        System.out.println("Enter your State : ");
        String state = input.nextLine();

        System.out.println("Enter your zip code : ");
        String zip = input.next();

        System.out.println("adress: "+ building+" "+ street+ " "+ roadName+", "+ city+ " "+ state+", "+zip);


    }
}

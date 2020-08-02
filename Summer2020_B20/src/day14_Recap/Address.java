package day14_Recap;
/*
 1. write a program for the shipping info that, the program should ask:
                    building number (
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your building Number : ");
        int buildingNumber= input.nextInt();

        input.nextLine();

        System.out.println("Enter your Street address:");
        String street =input.nextLine();

        System.out.println("Enter your City :");
        String city =input.nextLine();
        System.out.println("Enter your State :");
        String state =input.nextLine();
        System.out.println("Enter your zip code :");
        String zipcode =input.nextLine();

        System.out.println("Enter your full name :");
        String fullName =input.nextLine();

        System.out.println("Ship to : " +"\t" +fullName);
        System.out.println("\t"+"\t"+"\t"+buildingNumber+" "+street);
        System.out.println("\t"+"\t"+"\t"+city+", "+state+" "+zipcode);


input.close();






    }
}

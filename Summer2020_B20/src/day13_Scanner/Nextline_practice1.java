package day13_Scanner;

import java.util.Scanner;

public class Nextline_practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number : ");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street Name : ");
        String streetName= scan.nextLine();

        System.out.println(" Your adress is : "+ buildingNumber+" "+ streetName);

        scan.close();

    }
}

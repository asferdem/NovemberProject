package day14replitt;

import java.util.Scanner;

public class PatientInformation_reolit24 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Welcome to the patient portal!"+"\nPlease enter your personal information");
        String name=scan.next();
        System.out.println("Enter your last name");
        String lastName=scan.next();

        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();

        scan.nextLine();
        System.out.println("Enter your city");
        String city=scan.nextLine();
        System.out.println("Enter your state");
        String state=scan.nextLine();
        System.out.println("Enter your zip code");
        String zip= scan.nextLine();

        System.out.println("Enter your work phone number");
        long workphone = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalphone = scan.nextLong();
        System.out.println("Enter your age");
        int age= scan.nextInt();
        System.out.println("Enter your height");
        double height =scan.nextDouble();
        System.out.println("Are you married?");
        boolean married=scan.nextBoolean();
       /*
       Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true
        */
        System.out.println("Patient personal information"+"\nFull name: "+lastName+", "+name+
                            "\nAddress: "+street+" "+", "+state+" "+zip+
                            "\nContacts: work phone numbe - "+workphone+", personal phone number -"+personalphone+", email: "+email+
                            "Age: "+age+"\nHeight: "+height+"\nMarried?: "+married);
        scan.close();

    }
}

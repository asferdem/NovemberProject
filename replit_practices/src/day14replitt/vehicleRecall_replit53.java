package day14replitt;

import java.util.Scanner;

public class vehicleRecall_replit53 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter vehicle's year: ");
        int year = scan.nextInt();

        if((year>=1995&&year<=1998)||(year==2001&&year==2002)||(year>=2004&&year<=2006)||(year>=2015&&year<=2017)){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }scan.close();
    }
}

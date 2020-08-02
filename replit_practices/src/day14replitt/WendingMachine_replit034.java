package day14replitt;

import java.util.Scanner;

public class WendingMachine_replit034 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice=scan.nextInt();

        int quarters = (100-itemPrice)/25 ;
        int dimes = ((100-itemPrice) - (quarters * 25))/10;
        int nickels = ((100-itemPrice) - ((quarters*25)+(dimes*10)))/5;
        String result = "";
        if (itemPrice<=100 && itemPrice >=25 && itemPrice%5 == 0){
            System.out.println(result = "Your change is "+ quarters+ " quarters, "+ dimes + " dimes, and "+ nickels + " nickels.");}
        else {
            System.out.println("Invalid price!");

        }

scan.close();


    }
}

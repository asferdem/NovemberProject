package day12_Switch_Statement_Scanner;

import java.util.Scanner;

public class Scanner_RateCalculater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your annual Salary :");
        double salary = scan.nextDouble();
        System.out.println("How many hour works in a week : ");
        int hours = scan.nextInt();
        int totalHours = hours*52;
        double hourlyate = salary /totalHours;
        System.out.println(" Your Hourly Rate : "+ hourlyate+ " USD");






    }
}

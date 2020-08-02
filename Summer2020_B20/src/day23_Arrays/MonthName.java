package day23_Arrays;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        String[] month ={"January","February","March","April","May","June","July","August","Sep","Now","Dec","oct"};
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Your Number 1 to 12");
        int n=scan.nextInt();
        System.out.println(month[n-1]);

        System.out.println("======================================================");
        String[] day={"Monday","Thuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Enter your Day number");
        int num=scan.nextInt();
        System.out.println("Today is :"+day[num-1]);
        System.out.println("=======================================================");
        for (int i=0 ; i<=day.length-1; i++){
            System.out.print(day[i]+" ");
        }
        System.out.println();
    }
}

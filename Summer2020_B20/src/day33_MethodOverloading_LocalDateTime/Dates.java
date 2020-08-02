package day33_MethodOverloading_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {


        LocalDate DOB=LocalDate.of(1976,01,13);
        System.out.println(DOB);

        LocalDate today=LocalDate.now();
        System.out.println(today);

        LocalDate y=LocalDate.of(2019,1,1);
        boolean result =y.isLeapYear();
        System.out.println(result);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=scan.nextInt();
        boolean res=LocalDate.of(year,1,1).isLeapYear();
        System.out.println(res);






    }

}

package day07_Unary_ShortHand;
/*
called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisble by 4 is leap year
 */
public class LeapYear {
    public static void main(String[] args) {


        short year = 2020;
        int a = year%4;
        boolean leapYear = a == 0;
        // boolean result = year % 4 == 0 ;
        System.out.println( year + " is leap year ; "+ leapYear);

        System.out.println("=============================================");
       int  number = 65;
       boolean num1 = number%2 == 0;
       boolean num2 = number%3 == 0;
       boolean num3 = number%5 == 0;
       System.out.println(number +" is divisible by 2: " + num1);
       System.out.println(number +" is divisible by 3: " + num2);
       System.out.println(number +" is divisible by 5: " + num3);







    }
}


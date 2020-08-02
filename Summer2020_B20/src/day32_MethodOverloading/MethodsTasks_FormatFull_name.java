package day32_MethodOverloading;

import java.util.Scanner;

/*
 write a method that can retunr the full name of a person in reugral format
       ex:fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

    3.
 */
public class MethodsTasks_FormatFull_name {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String  first=scan.nextLine();
        String  last= scan.nextLine();

       String fullName=formatFullName(first,last);
        System.out.println(fullName);

    }






    public  static String formatFullName(String first,String last){
        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last= last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName=(first+" "+last);
        return  fullName;
    }

}

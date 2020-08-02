package day14_Recap;
/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */
import java.util.Scanner;

public class Scanner_practice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Your gender :  ");
        String gender=scan.next();
        System.out.println("Enter Your age :  ");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Your country name :  ");
        String country=scan.nextLine();
        System.out.println("Enter Your zip code :  ");
        int zip=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Your full name :  ");
        String  fullname= scan.nextLine();
        System.out.println("Enter Your Company name :  ");
        String company=scan.nextLine();

        System.out.println(fullname+"\n"+gender+"\n"+age+" years old"+"\n"+country+"\n"+company);
scan.close();
    }
}

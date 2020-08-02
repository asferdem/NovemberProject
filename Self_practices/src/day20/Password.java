package day20;

import java.util.Scanner;
/*
Write a program that asks user to enter his/her username and password
until user enters  correctly.there are only three attemptsafter three attempts:
lock the account
 */
public class Password {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String userName= "abc";
        String password="123";
        String res="";

        for (int i = 1 ; i<=3;i++){
            System.out.println("Enter your user name :");
            String user =scan.next();
            System.out.println("Enter your password :");
            String pword=scan.next();
            if (user.equals(userName) && pword.equals(password)){
                res="You are loged in !";
                System.out.println(res);
                System.exit(0);
            }else if(i == 3){
                System.out.println("your account blocked !");
                System.exit(0);


            } else if(pword.equals(password)||user.equals(userName)){
                System.out.println("Try one more time");

            }




        }






    }
}

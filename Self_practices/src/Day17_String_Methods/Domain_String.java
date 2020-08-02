package Day17_String_Methods;

import java.util.Scanner;

/*
write a program that will return the domain of an email address:
			Ex:
				input: test@gmail.com
				output: the domain of the email is: gmail

				inputL: Cybertek@yahoo.com
				output: the domain of the email is: yahoo
 */
public class Domain_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    String email=scan.next();
    int index1=email.indexOf("@");//8
    int index2=email.lastIndexOf(".");//14


     String result=email.substring(index1+1,index2);
        System.out.println(result);











    }
}

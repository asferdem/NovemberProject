package day13_Scanner;
/*
write a program that can caluclate the garade of the student based on the given score

					90 <= score <= 100 ==> Excellent
					80 <= score <= 89 ==> Great
					70 <= score <= 79 ==> Good
					60 <= score <= 69 ==> Passed
					0 <= score <= 59 ==> Failed
					other == > Invalid Entry


			MUST use Scanner and nested IF
 */
import java.util.Scanner;

public class Grade_calculate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score :");
        double score=input.nextDouble();
        if(score>=0 && score<=100){
            if (score>=90&&score<=100){
                System.out.println( "Your Grade is: Excellent");
            }else if (score>=80&&score<=89){
                System.out.println( "Your Grade is: Great");
            }else if (score>=70&&score<=79){
                System.out.println( "Your Grade is: Good");
            }else if (score>=60&&score<=69){
                System.out.println( "Your Grade is: Passed");
            }else{
                System.out.println( "Your Grade is: Failed");
            }



        }else{
            System.out.println("Invalid Score ");
        }
    }
}

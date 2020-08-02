package day14_Recap;
/*
. write a program that can calculate the grade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
 */
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score :");
        double score=input.nextDouble();
       input.close();

        String result="";
        if(score>=0 && score<=100){
            if (score>=90){
               result =" Excellent";  //System.out.println( "Your Grade is: Excellent");
            }else if (score>=80){
               result=" Great";  //System.out.println( "Your Grade is: Great");
            }else if (score>=70){
              result = "Good"; //System.out.println( "Your Grade is: Good");
            }else if (score>=60){
               result= "Passed";// System.out.println( "Your Grade is: Passed");
            }else{
              result= "Failed"; // System.out.println( "Your Grade is: Failed");
            }
            System.out.println("Your Grade is: "+ result);


        }else{
            System.out.println("Invalid Score ");

        }
    }
}

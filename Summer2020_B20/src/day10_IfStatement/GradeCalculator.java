package day10_IfStatement;

import com.sun.deploy.security.SelectableSecurityManager;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = 150;
        String grade= "";
        if (score >= 90 && score <= 100){
            grade = "A";
        }else if (score >= 80 && score < 90){
            grade= "B";
        }else if (score >=70 && score < 80){
            grade= "C";
        }else if (score >=60 && score <70){
            grade = "D";
        }else if(score >= 0 && score<60) {
            grade = "F";
        }else{
            grade= " Invalid Score ";
        }
        System.out.println(" Your Grade is : "+ grade);
    }
}

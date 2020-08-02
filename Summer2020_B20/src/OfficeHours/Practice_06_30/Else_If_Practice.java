package OfficeHours.Practice_06_30;

public class Else_If_Practice {
    public static void main(String[] args) {

        int score=125;
        char grade =' ';
        if(score>0&&score<=100) {
            if (score >= 90 ) {
                grade = 'A';

            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }System.out.println(grade);

        }else {
            System.out.println("invalid");
        }


       // char grade2= (score>=90&&score<=100) ? 'A': (score>=80) ? 'B':(score>=70) ? 'C':(score>=60)?'D':'F';

        //System.out.println(grade2);


    }
}

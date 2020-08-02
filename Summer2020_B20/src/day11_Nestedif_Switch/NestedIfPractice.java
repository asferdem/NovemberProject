package day11_Nestedif_Switch;

public class NestedIfPractice {
    public static void main(String[] args) {
        int score = 120;
        String result = "";

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else  {
                result = "F";
            }


        } else {
            result = "invalid";
        }
        System.out.println(result);
        System.out.println("=========================================");
        /*
        min salary of 30 k
        sub conditions : min 2 years of job history
         */

       double salary = 25000;
        int job = 1;
        String res= "";
        if(salary>= 30000){
            if(job >=2){
                res= " Yo Can Get Money";
            }else {
                res= " You Have to work more";
            }

        }else {
            res= "Yo can't eligible to loan";
        }
        System.out.println(res);

        System.out.println("==============================");

        int day = 8;
        String result1= "";
        if(day>=1 && day <=7){
            if(day==1){
                result1 =" Monday";
            }else if(day==2){
                result1 = "Tuesday";
            }else if(day== 3){
                result1 ="wednesday";
            }else if(day==4){
                result1 =" Thursday";
            }else if(day==5){
                result1= "Friday";
            }else if (day==6){
                result1 = "Saturday";
            }else{
                result1="Sunday";
            }

        }else {
            result1 = " There is no such a day";
        }
        System.out.println(result1);
        System.out.println("===================================================");

















    }
}

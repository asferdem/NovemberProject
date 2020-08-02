package OfficeHours.Practice_06_30;

public class If_statement {
    public static void main(String[] args) {


        int num =300;
        if (num%2==0){
            System.out.println(num+" is Even number !");
        }else{
            System.out.println(num+" is Odd number");
        }

        String result2=(num%2==0) ? num+" is Even number !":num+" is Odd number";

        System.out.println(result2);






    }
}

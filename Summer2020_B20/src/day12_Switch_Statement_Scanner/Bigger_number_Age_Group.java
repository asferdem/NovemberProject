package day12_Switch_Statement_Scanner;
/*
 1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
             */
public class Bigger_number_Age_Group {
    public static void main(String[] args) {

        double n1 = 5;
        double n2 = 7;
        double n3 = 150;
        //boolean n1isBigger = n1>n2&&n1>n3;
        //boolean n2isBigger = n2>n1 && n2>n3;
       String res = (n1>n2 && n1>n3) ? n1 + " is bigger"
               :(n2>n1&&n2>n3) ? n2+" is bigger"
               :n3+" is bigger";
        System.out.println(res);

        System.out.println("+++++++++++++++++++++++++++++++++");
/*
 write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
 */
        int age = 155 ;
        String result="";

        if ( age >0 && age <=150){
           /* if (age<21){
                result = "Teenager";
            }else if( age>=21 && age< 55){//age<=55
                result = "Adult";
            }else {
                result = " Senior";
            }

 */
           result= (age<21)? "Teenager": (age <55) ? "Adult": "Senior";




        }else result= "Invalid age";

        System.out.println(result);
    }
}

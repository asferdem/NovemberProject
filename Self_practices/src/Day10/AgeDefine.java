package Day10;
/*
write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
                    if age > 150 or less than 0 ==> invalid entry
 */
public class AgeDefine {
    public static void main(String[] args) {
        int age = 75 ;
        String result = "";
       if (age<3 && age >0){
           result ="baby";
       }
       else if (age>=3 && age <=5){
            result = "Toddler";
        }
       else if (age>5 && age<=9){
           result = "Kid";
       }else if (age>9 && age<=12){
           result = " Pre-Teen";
       }else if (age>12 && age<=17){
           result = " Teenager";
       }else if (age>17 && age<=20){
           result = " Young Adult";
       }else if (age>20 && age<=39){
           result = " Adult";
       }else if (age>39 && age<=49){
           result = " Young Midle Aged Adult";
       }else if (age>49 && age<=54){
           result = " Midle Aged Adult";
       }else if (age>54 && age<=64){
           result = " Very young senior Citizen ";
       }else if (age>64 && age<=74){
           result = " Young senior Citizen ";
       }else if (age>74 && age<=84) {
           result = "Senior Citizen ";
       }else if (age>84 && age<=150){
           result = " Old senior Citizen ";
       }else {
           result = "invalid entry";
       }
        System.out.println(result);









    }
}

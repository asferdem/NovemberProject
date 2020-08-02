package day05_AritmaticOperators;
/*
Employee' full name is: John Daniel
			 			John Daniel' gender is: Male
			 			John Daniel' age is: 35 years old
			 			John Daniel works at: CapitalOne
			 			John Daniel' Job title is: SDET
			 			John Daniel' salary is 120000.5 $
			 			John Daniel is full time employee: true
			 			John Daniel is married: false
 */
public class EmployeeInfo_1 {
    public static void main(String[] args) {
        String firstName = "John" ;
        String lastName = " Daniel";
        String gender= "Male";
        int age=35;
        String companyName = "CapitalOne";
        String jopTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120_000.50;

        System.out.println("Employee' full name is : "+ firstName+" "+lastName);
        System.out.println( firstName+" "+lastName+"' gender is :" + gender);
        System.out.println(firstName+" "+lastName+"'age is: "+ age);
        System.out.println(firstName+" "+lastName+" works at: "+companyName);
        System.out.println(firstName+" "+lastName+"' jop Title is:"+ jopTitle);
        System.out.println(firstName+" "+lastName+" Salary is: $"+salary );
        System.out.println(firstName+" "+lastName+"is full time employee: "+ isFullTime);
        System.out.println(firstName+" "+lastName+"is married: "+ isMarried);




    }
}

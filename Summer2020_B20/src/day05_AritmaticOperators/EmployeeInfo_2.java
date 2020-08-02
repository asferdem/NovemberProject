package day05_AritmaticOperators;

public class EmployeeInfo_2 {
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
        String fullName = firstName+" " +lastName ;

        System.out.println("Employee' full name is : "+fullName);
        System.out.println(fullName+"' gender is :" + gender);
        System.out.println(fullName+"'age is: "+ age);
        System.out.println(fullName+" works at: "+companyName);
        System.out.println(fullName+"' jop Title is:"+ jopTitle);
        System.out.println(fullName+" Salary is: $"+salary );
        System.out.println(fullName+"is full time employee: "+ isFullTime);
        System.out.println(fullName+"is married: "+ isMarried);

    }
}

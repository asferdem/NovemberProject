package day44_Constructor;
/*
called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender
            actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string

    3.
 */
public class Employee {
    String name;
    int ID;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed ;
    static boolean hasSalary ;

    static {
         isEmployed = true;
         hasSalary = true;
    }

    public void setEmployeeInfo(String name,int ID,int ssn,String jobTitle,double salary,char gender){
        this.name=name;
        this.gender=gender;
        this.jobTitle=jobTitle;
        this.ID=ID;
        this.ssn=ssn;
        this.salary=salary;

    }

    public String toString(){
        return "Name: "+name+"\nGender: "+gender+"\nID: "+ID+"\nSSN: "+ssn+"\nJobTitle: "+jobTitle+
                "\nSalary: "+salary;
    }

}

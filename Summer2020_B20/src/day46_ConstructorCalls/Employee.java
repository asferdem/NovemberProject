package day46_ConstructorCalls;
/*
lass Name: Employee
            instance variables:
                    name, jobTitle, ID, salary
            1st constructor: initialize the name of the employee
            2d constructor: initialize the name, jobTitle of the employee
                            (MUST apply constructor Call)
            3rd Constructor: initialize the name, jobTitle, ID of the employee
                            (MUST apply constructor Call)
            4th Constructor: initialize all the instance of the employee
                                (MUST apply constructor Call)
            Instance methods:
                toString()

 */
public class Employee {
    String name;
    String jobTitle;
    double salary;
    int ID;

    Employee(String name){
        this.name=name;
    }
    Employee(String name,String jobTitle){
        this(name);
        this.jobTitle=jobTitle;
    }
    Employee(String name,String jobTitle,int ID){
        this(name, jobTitle);
        this.ID=ID;
    }
    Employee(String name,String jobTitle,int ID,double salary){
        this(name,jobTitle,ID);
        this.salary=salary;
    }
    public String toString(){
        return "Name :"+name+"\nJob Title : "+jobTitle+"\nID : "+ID+"\nSalary : "+salary;
    }
}

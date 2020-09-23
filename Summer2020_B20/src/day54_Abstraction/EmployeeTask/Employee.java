package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

/*
.create a class named Employee (meant to be super class):
            Attributes:
                    name, gender(final), DOfB(final), jobTitle, Salary
                    create constructor that can initialize lal those attributes
                        (even final variable you should initialize them within constructor)
            Action:
 */
public class Employee {
       public String name;
       final public  char gender;
       final public  LocalDate DOfB;
       public String jopTitle;
       public  double salary;

    public Employee(String name, char gender, LocalDate DOfB, String jopTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.jopTitle = jopTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +
                ", gender=" + gender +
                ", DOfB=" + DOfB +
                ", jopTitle='" + jopTitle  +
                ", salary=" + salary +
                '}';
    }
}

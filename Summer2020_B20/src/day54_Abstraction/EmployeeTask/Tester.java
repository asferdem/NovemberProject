package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public final class Tester extends Employee {

    public Tester(String name, char gender, LocalDate DOfB, String jopTitle, double salary){
        super(name, gender, DOfB, jopTitle, salary);

    }
    public void findBug(){
        System.out.println(name+ " is Found a bug");
    }

}

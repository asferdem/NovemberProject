package day57_Polymorphism.Task;

import java.util.ArrayList;
import java.util.Arrays;

/*
create an arraylist(you decide the reference type),
and store 4 testers and 3 developers object
 */
public class Apple {
    public static void main(String[] args) {

        Employee tester1=new Tester("Fatih", "12345", "SDET", 12000, 'M');
        Employee tester2=new Tester("Ali", "456321", "SDET", 10000, 'M');
        Employee tester3=new Tester("Veli", "452145", "SDET", 11000, 'M');
        Employee scrumMaster=new ScrumMaster("Deli", "452145", "SDET", 90000, 'M');

        Employee developer1=new Developer("Seli", "222222", "DEV", 15000, 'M');
        Employee developer2=new Developer("Keli", "111111", "DEV", 90000, 'F');


        //Scrum Team

        ArrayList<Employee> scrumTeam=new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2,tester3,developer1,developer2,scrumMaster));


        for (Employee each :scrumTeam){
            System.out.println(each);
        }



    }
}

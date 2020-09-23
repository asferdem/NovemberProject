package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

/*
 create a class called PenFed
            create 3 objects of Tester and Developers
            try to make change to the gender & DOfB of the employees
 */
public class PenFed {
    public static void main(String[] args) {
        Tester tester1=new Tester("Polat Alemdar",'M', LocalDate.of(1973,11,20),
                "KABADAYI",1500000);
       //tester1.gender='F'; can not modify it becouse final
       // tester1.DOfB=LocalDate.of(2000, 11, 20);

        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);

        Developer developer1=new Developer("Murat",'M', LocalDate.of(1991,04,11),
                "SDET",110000);
        System.out.println(developer1);
        System.out.println(developer1.gender);

    }
}

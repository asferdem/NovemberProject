package MethodOverRiding.GoogleTask;

import java.util.ArrayList;
import java.util.Arrays;

/*
create 5 objects of the Tester and 5 objects of Developer
            create an arrayList of Tester and an ArrayList of Developer, store those 5 objects of the Tester & Developers
            use for each loop to iterate Tester & Developer objects from in those arrayLists
                print out the tester & developer who has the highest salary
 */
public class Google {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Ramazan", 22, 'F',"G123", "SDET", 190_000);
        Tester tester2 = new Tester("Laura", 35, 'F',"G453", "QA", 120_000);
        Tester tester3 = new Tester("Lale", 49, 'F',"G567", "SDET", 190_000);
        Tester tester4 = new Tester("John", 28, 'M',"G687", "Tester", 160_000);
        Tester tester5 = new Tester("David", 40, 'M',"G889", "Automation Tester", 170_000);

        Developer developer1 = new Developer("Edgard", 34, 'M', "G333", "Junior_Dev", 190_000);
        Developer developer2 = new Developer("Marat", 22, 'M', "G999", "Junior_Dev", 200_000);
        Developer developer3 = new Developer("Cristina", 38, 'F', "G222", "Mid_Dev", 220_000);
        Developer developer4 = new Developer("Samvel", 39, 'M', "G987", "Junior_Dev", 180_000);
        Developer developer5 = new Developer("Ana", 29, 'F', "G878", "Senior_Dev", 240_000);

        ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(tester1,tester2,tester3,tester4,tester5));
        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(developer1,developer2,developer3,developer4,developer5));

        System.out.println(testers);
        System.out.println(developers);


    }
}

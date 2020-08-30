package day47_Encapsulation;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {


        Person person1 = new Person("FATIH", 44, 'M', LocalDate.of(1976,01,13));

        person1.setID(123);
        person1.setSsn(123456);
        person1.setAddress("NJ");

        System.out.println(person1);

        System.out.println(person1.getID());
        System.out.println(person1.getSsn());
        System.out.println(person1.getAddress());


    }
}
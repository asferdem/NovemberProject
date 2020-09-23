package com.cybertek.tests.day6_RecapDropdown;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {
    @Test
    public void faker_test(){

        Faker faker=new Faker();

        String firstname=faker.name().firstName();
        System.out.println("firstname = " + firstname);

        String lastName=faker.name().lastName();
        System.out.println("lastName = " + lastName);

        String fullName=faker.name().fullName();
        System.out.println("fullName = " + fullName);

        String address=faker.address().fullAddress();
        System.out.println("address = " + address);

    }



}

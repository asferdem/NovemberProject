package MethodOverRiding.GoogleTask;
/*
attributes:
                name, age, gender
            add a constructor that can initialize the attributes
            create a toString method that can print any Person object
 */
public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String toString() {
        return "name: " + name +", age:" + age + ", gender:" + gender ;
    }
}

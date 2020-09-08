package day49_Inheritance.ScrumTeamTest;
/*
tasks:
        create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo

 */
public class Person  {

    public  String name;
    public  int age;
    public char gender;

    private long SSN;

    public long getSSN(){
        return SSN;
    }

    public void setSSN(long SSN){
        this.SSN=SSN;
    }

    private void  eat(){
        System.out.println(name+" is eating");
    }
    private void  walk(){
        System.out.println(name+" is walking");
    }
    public void  sleep(){
        System.out.println(name+" is sleeping");
    }

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

package day44_Constructor;

public class Student {


    String name;
    int age;
    char gender;

    static String  schoolName="Cybertek University";


    public Student(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
/*
    public void setInfo(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }
*/
    public String toString(){

        return "Student Name : "+name+"\nAge : "+age+"\nGender : "+gender+"\nSchool Name: "+schoolName;
    }




}

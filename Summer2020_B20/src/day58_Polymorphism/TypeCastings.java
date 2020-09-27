package day58_Polymorphism;

import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class TypeCastings {
    public static void main(String[] args) {
        int a=10;
        double b=a;//implicit casting

        Dog dog1=new Dog("ASF", 2, 'F');

        Cat cat1=new Cat("asc", 3, 'M');
        Animal animal1=dog1;//upcasting done automatically

        Animal animal2=(Animal) cat1;// done implicitly

        System.out.println("================================");
        int x=100;
        byte y=(byte)x;//must be done manually explicitly casting


        Animal animal3= new Dog("asc", 5, 'f');

       // animal3.bark();

        Dog dog2=(Dog) animal3;// down casting its done explicitly you must do it manually

        dog2.bark();



    }



}

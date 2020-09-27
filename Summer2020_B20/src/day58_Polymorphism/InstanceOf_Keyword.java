package day58_Polymorphism;

import day55_AbstractionCont.ShapeTask.Circle;
import day55_AbstractionCont.ShapeTask.Cylinder;
import day55_AbstractionCont.ShapeTask.Shape;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class InstanceOf_Keyword {
    public static void main(String[] args) {
        Animal animal1=new Animal(10, 'F');
        Animal animal2=new Dog("ASD", 12, 'F');
        Animal animal3=new Cat("sad", 5, 'M');


        boolean r1=animal3 instanceof Animal;// is A relation ==>true
        System.out.println(r1);//true

        boolean r2=animal3 instanceof Cat;
        System.out.println(r2);//true

        boolean r3=animal3 instanceof Dog;//false
        System.out.println(r3);

        boolean r4=animal2 instanceof Animal;//true
        System.out.println(r4);

        boolean r5=animal1 instanceof Dog;//false
        System.out.println(r4);
        System.out.println("===============================================");
        Shape shape1=new Circle(3);
        identifyShape(shape1);



    }


    public static void identifyShape(Shape shape){
        if (shape instanceof Circle){
            System.out.println("Shape is Circle");
        }else if(shape instanceof Cylinder){
            System.out.println("Shape is Cylinder");
        }else{
            System.out.println("Shape is Rectangle");
        }

    }
}

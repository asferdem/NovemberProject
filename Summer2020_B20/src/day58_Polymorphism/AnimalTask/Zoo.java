package day58_Polymorphism.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
       // Animal cat1=new Cat("Pisi", 2, 'M');

        Dog dog1=new Dog("pamuk",3,'F');
        dog1.sleep();
        dog1.eat();
        dog1.bark();
        System.out.println(dog1.age);
        System.out.println(dog1.dogName);
        System.out.println(dog1.gender);


        System.out.println("=======================================");
        Animal animal1=new Dog("pamuk",3,'F');
        animal1.sleep();
        animal1.eat();
        //animal1.bark();

       // System.out.println(animal1.dogName);
        System.out.println(animal1.age);
        System.out.println(animal1.gender);
        System.out.println(animal1);

    }
}

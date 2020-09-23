package day56_Abstractions.AnimalTask;

public class Eagle extends Animal implements Flyable{
    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}

package day56_Abstractions.AnimalTask;

public class Duck extends Animal implements Flyable,Playable,Swimable{
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
        System.out.println("Flying");
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void swim() {
        System.out.println("swimming");

    }
}

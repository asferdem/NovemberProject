package day56_Abstractions.AnimalTask;

public class Turtle extends Animal implements Playable{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }
}

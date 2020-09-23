package day56_Abstractions.AnimalTask;

public class Cat extends Animal implements Playable {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping ");
    }
    public void play(){
        System.out.println("cat is playing");
    }

}

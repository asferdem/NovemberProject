package day51_Expections.PetsTasks;

public class Dog extends Pet{

    double price;
    public Dog(String name, String breed, char gender, int age, String color,double price) {
        super(name, breed, gender, age, color);
        this.price=price;
    }


    public String toString() {
        return "Dog{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

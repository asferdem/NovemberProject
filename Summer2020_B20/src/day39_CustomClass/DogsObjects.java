package day39_CustomClass;

public class DogsObjects {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.setDogInfo("Ice","Haskey","long",3,"White");
        dog1.getDogInfo();
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        System.out.println("=============================================");
        Dog dog2=new Dog();
        dog2.setDogInfo("Boby","Pitbull","Small",5,"Black");
        dog2.getDogInfo();
        dog2.sleep();
        dog2.drink();
        dog2.eat();
    }
}

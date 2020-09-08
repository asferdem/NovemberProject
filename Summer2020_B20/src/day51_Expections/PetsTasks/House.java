package day51_Expections.PetsTasks;

public class House {
    public static void main(String[] args) {

        Dog dog1=new Dog("Winton","Scotty Terrier",'M',4, "Black",2000);

        System.out.println(dog1.name);
        System.out.println(dog1);
        System.out.println("===================================");

        Cat cat1= new Cat("Harry","Furmonger",'m',7,"brown");

        System.out.println(cat1.name);
        System.out.println(cat1);

        System.out.println("===================================");

        Tiger tiger1 = new Tiger("Zara","Caspian",'M',12,"Brown");
        System.out.println(tiger1.name);
        System.out.println(tiger1);


    }
}

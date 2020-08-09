package day39_CustomClass;

public class CarObjects {

    public static void main(String[] args) {
       Car car1=new Car();
/*
       car1.brand = "Toyota";
       car1.model="Sienna";
       car1.color="White";
       car1.year=2020;
       car1.mileage=1356.5;
       car1.price=35000;

 */
       car1.setInfo("Toyota","Sienna",2020,"White",1356.5,35000);


        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.price);
        System.out.println("================================================");

        Car car2= new Car();
/*
        car2.brand = "BMW";
        car2.model="X5";
        car2.color="Black";
        car2.year=2020;
        car2.mileage=500.2;
        car2.price=30000.21;

 */
        car2.setInfo("BMW","X 5",2019,"Red",1000.5,30000);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.price);
    }



}

package day39_CustomClass;

public class CarMax {

    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        Car car5=new Car();


        car1.setInfo("Audi","A 8 Long ",2021,"Black",1000.5,40000);
        car2.setInfo("Tesla","Model X",2020,"Gray",1000.5,50000);
        car3.setInfo("Jeep","Commander ",2021,"Red",1000.5,40000);
        car4.setInfo("Ford","Expedition",2020,"Blue",1000.5,50000);
        car5.setInfo("Honda","Pilot",2021,"Silver",1000.5,40000);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();


        car1.start();

    }
}

package day41_Static;

public class Car {
    String brand ;// instance variable
    String model;
    int year;
    String color;
    double price;
    public void setCarInfo(String brand,String model,int year,String color,double price){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;




    }
    public  String toString(){

        return  year+" "+brand+" "+model+", "+color+", $"+price;
    }

}

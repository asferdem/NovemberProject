package day39_CustomClass;

public class Car {
    /*
    Attributes:model,brand,year,color,mileage

     */
    String brand ;// instance variable
    String model;
    int year;
    String color;
    double mileage;
    double price;

     public void setInfo(String carBrand,String carModel,int carYear,String carColor,double carMileage,double carPrice){
         brand=carBrand;
         model=carModel;
         year=carYear;
         color=carColor;
         mileage=carMileage;
         price=carPrice;


     }

     public void getInfo(){
         System.out.println(year+" "+brand+" "+model+", "+color+", "+mileage+", "+price);
     }



}

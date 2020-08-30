package OfficeHours.Practice_08_19_2020;

import java.util.ArrayList;

public class Order {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzaB20=new ArrayList<>();

        for (int i=0;i<400;i++){
            Pizza order1=new Pizza();
            order1.set("Large",4,4);
            pizzaB20.add(order1);
        }

        System.out.println("Total pizza : "+pizzaB20.size());

            double price=0;
            for (Pizza each:pizzaB20){
                price+=each.calcost();
            }
        System.out.println("Total Bill : "+price);
    }
}

package day15;

import java.util.Scanner;

public class Gift_card {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter your item :");
        String item=s.nextLine();
    double gift= 100;
    int price =0;
    String res="Sorry, not enough funds on your gift card!";
    String res1="Thank you for your purchase!";
    String res2 = "Your current balance is: ";

    if(item.equalsIgnoreCase("usb cable") ){
        price=10;
        System.out.println(res1);
        System.out.println(res2+(100-price)+" $");
    }else if (item.equalsIgnoreCase("socks")){
        price=5;
        System.out.println(res1);
        System.out.println(res2+(100-price)+" $");
    }else if (item.equalsIgnoreCase("charger")){
        price=15;
        System.out.println(res1);
        System.out.println(res2+(100-price)+" $");
    }else if (item.equalsIgnoreCase("hat")){
        price=25;
        System.out.println(res1);
        System.out.println(res2+(100-price)+" $");
    }else if (item.equalsIgnoreCase("headphones")){
        price=30;
        System.out.println(res1);
        System.out.println(res2+(100-price)+" $");

    }else if (item.equalsIgnoreCase("pants")){
        price=50;
        System.out.println(res1);
        System.out.println(res2+(100-price)+" $");
    }else if (item.equalsIgnoreCase("Blankets")){
        price=60;
        System.out.println(res1);
        System.out.println(res2+(100-price)+" $");
    }else if (item.equalsIgnoreCase("pillow")){
        price=40;
        System.out.println(res1);
        System.out.println(res2+(100-price)+" $");
    }else if (item.equalsIgnoreCase("smartphone")){
        price=300;
        System.out.println(res);
    }else if (item.equalsIgnoreCase("laptop")){
        price=400;
        System.out.println(res);
    }else {
        System.out.println("Invalid item!");
    }






    }
}

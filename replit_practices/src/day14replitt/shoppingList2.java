package day14replitt;

import java.util.Scanner;

public class shoppingList2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 =scan.next();
        int count1=scan.nextInt();
        double price1= scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2 =scan.next();
        int count2=scan.nextInt();
        double price2= scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3 =scan.next();
        int count3=scan.nextInt();
        double price3= scan.nextDouble();

        double totalPrice1= count1*price1;
        double totalPrice2= count2*price2;
        double totalPrice3= count3*price3;
        double totalprice= 55;
        if (count2==0){
            System.out.println("Item1: "+item1+" Price: "+totalPrice1+", "+"Item3: "+item3+" Price: "+totalPrice3);
            totalprice=totalPrice1+totalPrice3;
        }else {
            System.out.println("Item1: "+item1+" Price: "+totalPrice1+", "+"Item2: "+item2+" Price: "+totalPrice2);
            totalprice=totalPrice1+totalPrice2;
        }
        System.out.println("Total price: "+totalprice);
scan.close();
    }
}

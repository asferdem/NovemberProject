package day58_Polymorphism;

import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;
import java.util.Arrays;
/*
  create an arrayList called phoneShop and store all phone objects from array of phone
        write a program that can count the total number of Iphone, Samsung and Huawei from the list
 */
public class PhoneShop1 {
    public static void main(String[] args) {


        Phone[] phone = {
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100)
        };

        ArrayList<Phone> phoneShop=new ArrayList<>();
        phoneShop.addAll(Arrays.asList(phone));
        int iphoneNumber=0;
        int samsungNumber=0;
        int huaweiNummber=0;
        for (Phone each:phoneShop){
            if (each.brand.equalsIgnoreCase("iphone")){
                iphoneNumber++;
            }else if(each.brand.equalsIgnoreCase("samsung")){
                samsungNumber++;
            }else{
                huaweiNummber++;
            }
        }
        System.out.println("iphoneNumber = " + iphoneNumber);
        System.out.println("samsungNumber = " + samsungNumber);
        System.out.println("huaweiNummber = " + huaweiNummber);


    }
}
package day58_Polymorphism;

import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {
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
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100)
        };
        ArrayList<Phone> phoneShop=new ArrayList<>(Arrays.asList(phone));

        int iphoneNumber=0;
        int samsungNumber=0;
        int huaweiNumber=0;
        for (Phone each:phoneShop){
            if (each instanceof Iphone){
                iphoneNumber++;
            }else if(each instanceof Samsung){
                samsungNumber++;
            }else{
                huaweiNumber++;
            }
        }
        System.out.println("iphone Number = " + iphoneNumber);
        System.out.println("samsung Number = " + samsungNumber);
        System.out.println("huawei Number = " + huaweiNumber);


    }
}

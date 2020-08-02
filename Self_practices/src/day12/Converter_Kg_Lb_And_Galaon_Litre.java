package day12;

import java.util.Scanner;
/*
write a program that can conver Kg to lb
				MUST use Scanner

	4. write a program that can convert gallons to litters
				MUST use scanner
 */
public class Converter_Kg_Lb_And_Galaon_Litre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your KG :");
        double kg= input.nextDouble();
        double calculate = kg*2.2;
        System.out.println( kg+" Kg = "+calculate+"Lb");
        System.out.println("=============================================");
        System.out.println("Enter your galon: ");
        double galons = input.nextDouble();
        double liters = galons*3.785;
        System.out.println( galons+" Galon = "+ liters +" Lt");




    }
}

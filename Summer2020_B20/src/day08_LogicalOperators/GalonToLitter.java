package day08_LogicalOperators;
/*
write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
 */
public class GalonToLitter {
    public static void main(String[] args) {
        double galons = 20 ;
        double liters = galons * 3.785 ;
        System.out.println( galons + " Galons equal to " + liters +" litters");
        System.out.println("==================================================");
        double liter = 1000 ;
        double galon = liter / 3.785 ;
        System.out.println(liter +" Liters equal to "+ (int)galon + " Galons");


    }
}

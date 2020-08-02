package day09_ifElse_Statement;
/*
 2. write a java program that accepts three numbers and return the minimum number
         (assume that none of them are equal)
 */
public class tax2Minimum {
    public static void main(String[] args) {
        double a= 500;
        double b=200;
        double c = 1452;
        boolean aIsMin = a < b && a < c ;
        boolean bIsMin = b < a && b < c ;// = aIsMIN== falde && b<c or !aIsMin && b < c
        boolean cIsMin = !aIsMin && !bIsMin ; // c < a && c < b

        double min = 0;
        if (aIsMin){
            min = a;
        }
        if (bIsMin){
            min = b;
        }
        if (cIsMin){
            min = c;
        }
        System.out.println( min+ " is minimum number");
    }
}

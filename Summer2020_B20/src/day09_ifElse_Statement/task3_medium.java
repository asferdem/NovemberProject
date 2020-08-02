package day09_ifElse_Statement;
/*
3. write a java program that accepts three numbers and return the medium number
         (assume that none of them are equal
 */
public class task3_medium {
    public static void main(String[] args) {
        double a= 100;
        double b= 200;
        double c= 150;
        boolean aIsMed =( a>b && a<c) || ( a > c && a < b);
        boolean bIsMed = (b >c && b < a) || ( b<c && b > a );
        boolean cIsMed = !aIsMed && !bIsMed ;

        double med  = 0;
        if (aIsMed){
            med = a ;

        }
        if (bIsMed){
            med = b;
        }
        if (cIsMed){
            med = c ;
        }
        System.out.println(med +" is medium number");
    }
}

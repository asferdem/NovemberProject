package day09_ifElse_Statement;
/*
        1. write a java program that accepts three numbers and return the maximum number
          (assume that none of them are equal)
         2. write a java program that accepts three numbers and return the minimum number
         (assume that none of them are equal)
         3. write a java program that accepts three numbers and return the medium number
         (assume that none of them are equal)
 */
public class task01Maximum {
    public static void main(String[] args) {
        double a= 5000;
        double b= 20000;
        double c= 1000;
        boolean aIsMax = a > b && a > c;
        boolean bIsMax = aIsMax == false && b > c ;
                //b > a && b > c ;
        boolean cIsMax = !aIsMax && !bIsMax ;
                        // c > a && c > b ;
        double max = 0 ;// next we will change
        if (aIsMax){
            //System.out.println(a+ " is maximum number ");
            max = a;
        }
         if (bIsMax){
             //System.out.println(b);
             max = b ;
         }
        if (cIsMax){
            // System.out.println(c);
            max = c ;
        }
        System.out.println(max+" is the maximum number");








    }
}

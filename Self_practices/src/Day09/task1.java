package Day09;
/*
 write a program that can check if number is positive negative or equals to zero.
        for example:
            num  = 1
            prints:
                1 is positive number
            num = -6
            print:
                6 is negative number
            num = 0
            print:

 */
public class task1 {
    public static void main(String[] args) {
    double num = 5;
    if (num > 0);{
            System.out.println(num + " is positive number");
        }
     if (num < 0 ){
         System.out.println(num +" is negative number");
     }
     if ( num == 0 ){
         System.out.println("  zero");
     }
    }
}

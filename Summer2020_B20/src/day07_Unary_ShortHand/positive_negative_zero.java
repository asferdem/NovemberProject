package day07_Unary_ShortHand;
/*
 write a program that can verify if a number is positive, negative, 0
        Positive_Negative_0
        Ex:
            number = 120
        Output:
            120 is a positive number? true
            120 is negative number? false
            120 ii zero? false
 */
public class positive_negative_zero {
    public static void main(String[] args) {
    int number = 125;// we can use double
    boolean positive = number > 0;
    boolean negative = number < 0;
    boolean zero     = number == 0;
        System.out.println( number +" is a positive number ? "+ positive);
        System.out.println( number +" ia a negative number ? "+ negative);
        System.out.println(number+ " is zero ?"+zero);



    }
}

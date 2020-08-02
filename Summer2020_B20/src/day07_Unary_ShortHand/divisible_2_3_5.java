package day07_Unary_ShortHand;

public class divisible_2_3_5 {
    public static void main(String[] args) {
        int  number = 255;
        boolean divisible2 = number%2 == 0;
        boolean divisible3 = number%3 == 0;
        boolean divisible5 = number%5 == 0;
        System.out.println(number +" is divisible by 2: " + divisible2);
        System.out.println(number +" is divisible by 3: " + divisible3);
        System.out.println(number +" is divisible by 5: " + divisible5);



    }


}

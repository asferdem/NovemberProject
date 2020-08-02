package day25_Practices;
/*
Write a program that can count the even and odd number from an array of integers
 */
public class CountEvenOdd {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7,8,9,10,11};

        int countEven= 0;
        int countOdd = 0;

        for (int each : nums){
            if (each %2==0){
                countEven++;
            }else{
                countOdd++;
            }

        }
        System.out.println("Even numbers : "+countEven);
        System.out.println("Odd numbers : "+countOdd);





    }
}

package day24_Arrays;
/*

	3. Write a program that can return the average number from an array of integers
			ex: [1,2,3]
			average: 2

			[10, 15, 5, 6]
			average: 9


 */
public class Avarage_Number {
    public static void main(String[] args) {;
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int  sum = 0;

        for (int i =arr.length-1 ; i>=0; i--){
            sum+=arr[i];
        }

        System.out.println("Sum is: "+ sum);

        double avrg= sum /(double)arr.length;

        System.out.println("Avarage number is : "+avrg);



    }
}

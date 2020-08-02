package OfficeHours.Practice_07_20_2020;
/*
 write a program that can find the maximum number from any given two dimensional array

 */
public class Max_2DArray {
    public static void main(String[] args) {

        int[][] ar2D={{1,200,3},{4,5,6,7},{8,9,10,11,12},{13,14,15,20,30} };

        int max=ar2D[0][0];

        for (int j =0; j<=ar2D.length-1; j++) {
            int[] eachArray = ar2D[j];
            for (int i = 0; i <= eachArray.length - 1; i++) {
                if (eachArray[i] > max) {
                    max = eachArray[i];
                }
            }

        }
        System.out.println("Maximin is: " + max);
        System.out.println("==================================================");
    }
}

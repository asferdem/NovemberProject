package OfficeHours.Practice_07_20_2020;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] ar2D={{1,200,3},{4,5,6,7},{8,9,1000,11,12},{13,14,15,20,30} };

        int max=ar2D[0][0];

        for (int[] each1: ar2D){
            for (int each : each1){
                if (each>max){
                    max=each;
                }

            }
        }

        System.out.println("Maximum is: "+ max);

    }
}

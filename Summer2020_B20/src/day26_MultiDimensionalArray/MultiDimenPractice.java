package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimenPractice {
    public static void main(String[] args) {
        String[] testers = {"Fatih", "Ayhan",};
        String[] devolopers = {"Ziadin", "Nese", "Murat", "Mehary"};
        String[] SM = {"Nadir"};
        String[] Po = {"Mehmet"};
        String[] BA = {"Ali"};
        String[] testers2 = {"ali", "veli",};

        String[][] scrumTeam = {testers, devolopers, SM, Po, BA};

        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] = "Adam";
        scrumTeam[1][3] = "Ayse";
        scrumTeam[0] = testers2;
        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("==========================================");

        for (String[] each : scrumTeam) {
            for (String name : each) {
                System.out.println(name);
            }
            System.out.println(Arrays.toString(each));
        }
        System.out.println("===========================================");

        int[][] scores = { {10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 125, 135}   };

        for (int[] each : scores){
            for (int element: each){

                if (element%3==0||element%5==0){
                    System.out.print(element+" ");
                }
            }

        }

        System.out.println("=============================================");

        int[][] a1={{0,2,12},{3,4,6}};
        int[][] a2={{1,8,22},{5,9,11}};

      int[][][]  a3d={ {{0,2,12},{3,4,6}} , {{1,8,22},{5,9,11}}  };
                    //           0                  1














    }
}

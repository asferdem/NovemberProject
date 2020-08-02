package day28_Recap;

import java.util.Arrays;

public class MultiDimArray3D {
    public static void main(String[] args) {
        int[][] ar2d={{1,2,3},{4,5}};


        int[][][] ar3D={ {{1,2,3},{4,5}} ,{{6,7,8},{9,10}}     };

        System.out.println(Arrays.deepToString(ar3D));
        System.out.println(Arrays.deepToString(ar3D[1]));
        System.out.println(ar3D[0][1][0]);


    }
}

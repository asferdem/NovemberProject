package day24_Arrays;

public class UniqueNumberForEachLoop {
    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 3, 3,5,6};

        for (int a:arr) {
            int count = 0;

            for (int b :arr) {
                int each = b;
                if (b == a) {
                    count++;
                }
            }
            if (count==1){
                System.out.print(a+" ");
            }

        }



    }
}

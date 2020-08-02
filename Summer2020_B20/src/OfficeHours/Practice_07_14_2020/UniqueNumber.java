package OfficeHours.Practice_07_14_2020;

public class UniqueNumber {
    public static void main(String[] args) {

        int[] arr={1,1,2,3,3,1,5,6,7};

        for(int b : arr){

            int count = 0;
            for (int each: arr){
                if (b==each){
                    count++;
                }
            }
            if (count==1){
                System.out.println(b);
            }

        }




    }
}

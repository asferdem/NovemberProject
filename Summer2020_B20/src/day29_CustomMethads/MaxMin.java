package day29_CustomMethads;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers={1,5,12,54,78,6,98,62};

        maxNum(numbers);
        minNum(numbers);



    }













    public static void maxNum(int[] arr){
        int max=arr[0];
        for (int each: arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println("Max is :"+max);
    }

    public static void minNum(int[] arr){
        int min=arr[0];
        for (int each: arr){
            if (each<min){
                min=each;
            }
        }
        System.out.println("Min is :"+min);
    }


}

package day_18_for_loop_task;

public class asdfg {
    public static void main(String[] args) {

        int sum=0;
        int sum1=0;
        int[] numbers={1,2,3,4,5,6,7,8,9,10,12,13};
        for (int each:numbers){
            sum+=each;
        }
        System.out.println(sum);

        for(int i=1;i<=numbers.length+1;i++){
            sum1 +=i;

        }
        System.out.println(sum1);
        System.out.println("Missing number is :"+(sum1-sum));

    }
}

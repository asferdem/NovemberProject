package day21;

public class practice {
    public static void main(String[] args) {
        int count = 7;
        int num1 = 0;//2
        int num2 = 1;//3
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)//1 2 3 4
        {
            System.out.print(num1+" ");//0 1 1 2

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOfPrevTwo = num1 + num2;//3
            num1 = num2;
            num2 = sumOfPrevTwo;//3
        }
    }
}





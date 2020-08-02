package day35_ArrayList;

public class SumOfDigit2 {
    public static void main(String[] args) {
        String  str="a1b2c3d4e5f6";
        int sum=0;

        for (char each :str.toCharArray()){

            if (Character.isDigit(each)){

                sum+=Integer.parseInt(""+each);
            }

        }
        System.out.println(sum);







    }
}

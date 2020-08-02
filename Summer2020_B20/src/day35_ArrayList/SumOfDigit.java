package day35_ArrayList;
/*
write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)

               HINT: on ascii table, the characters between #48 ~ #57 are digits
 */

public class SumOfDigit {
    public static void main(String[] args) {
        String  str="a1b2c3d4e5f6";
        int sum=0;

        for (int i=0;i<=str.length()-1;i++){

            char ch = str.charAt(i);
            if ( ch>=48 && ch<=57 ){
                sum +=Integer.parseInt(""+ch);
            }


        }

        System.out.println(sum);








    }
}

package Day10;
/*
write a program that can check the equality of the three given numberrs
            declare 3 numbers n1, n2, n3
            if n1 and n2 are equal and not equal to n3  => n1&n2 are equal
            if n2 and n3 are equal and not equal to n1==> n2&n3 are equal
            if n3 and n1 are qual and not equal to n2 ==>n3&n1 are equal
            if all equal ==> all equal
            if none of them are euqal ==> none of them are equal
 */
public class Equality {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 1;
        int num3 = 4;
        String res = "";
        if (num1 == num2 && num1 != num3) {
            res = num1 + "&" + num2 + " are Equal";
        } else if (num2 == num3 && num2 != num1) {
            res = num2 + "&" + num3 + " are Equal";
        } else if (num3 == num1 && num3 != num2) {
            res = num3 + "&"+ num1 + " are Equal";
        } else if (num1 == num2 && num2 == num3) {
            res = "All Equal  ";
        } else {
            res = " None of them are Equal";
        }
        System.out.println(res);
    }
}

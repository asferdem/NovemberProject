package day11_Nestedif_Switch;
/*
1. write a java program that can convert numbers between 0 ~ 9 to words,
if the number is greater than 9 or less than zero, out put should be "Invalid".
 */
public class Ternary_Practice4 {
    public static void main(String[] args) {
        int num = 9;

        String result = (num==0) ? "Zero" : (num ==1) ? "one" : (num==2) ? "Two" : (num==3) ? "Tree" : ( num==4) ? "Four":
                (num== 5) ? "Five" : (num== 6) ? "Six"  : (num== 7) ? "Seven" : (num== 8) ? " Eight": (num == 9) ? "Nine"
                        :"\"invalid Number\"";
        System.out.println(result);

    }
}

package day11_Nestedif_Switch;
/*
1. write a java program that can convert numbers between 0 ~ 9 to words,
if the number is greater than 9 or less than zero, out put should be "Invalid".
 */
public class NumberToWords {
    public static void main(String[] args) {
        int num = 10;
        String result ="";

        if (num==0)
            result ="zero";
        else if (num==1){
            result="one";
        }else if (num==2) {
            result = "two";
        }else if (num==3){
            result="tree";
        }else if (num==4) {
            result = "four";
        }else if (num==5){
            result="five";
        }else if (num==6) {
            result = "six";
        }else if (num==7){
            result="seven";
        }else if (num==8) {
            result = "Eight";
        }else if (num==9){
            result="nine";
        }else  {
            result = "invalid";
        }
        System.out.println(result);


    }
}

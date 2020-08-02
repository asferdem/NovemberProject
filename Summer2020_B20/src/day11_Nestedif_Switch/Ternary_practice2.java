package day11_Nestedif_Switch;

public class Ternary_practice2 {
    public static void main(String[] args) {
        int  num = 100;
        String  result ="";
        if (num > 0){
            result= "Positive";
        }else if (num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("===============================================");

        String result2= (num > 0)? "Positive" : (num < 0) ? "Negative": "Zero";
        System.out.println(result2);




    }
}

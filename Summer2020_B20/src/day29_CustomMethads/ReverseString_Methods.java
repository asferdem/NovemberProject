package day29_CustomMethads;

public class ReverseString_Methods {
    public static void main(String[] args) {
        reverse("Fatih ERDEM");
        reverse("erdem");



    }
















    public static void reverse(String str ){
        String result="";

        for (int i=str.length()-1; i >=0 ;i--){
            result += str.charAt(i);
        }
        System.out.println(result);





    }
}

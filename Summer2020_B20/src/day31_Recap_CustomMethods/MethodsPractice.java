package day31_Recap_CustomMethods;
/*

1. create a method that can reverse a string
2. identify if a string is palindrome
 */
public class MethodsPractice {
    public static void main(String[] args) {
      String name="MadaM";
        System.out.println(reverse1(name));
        System.out.println((name.equalsIgnoreCase(reverse1(name))));

    }


 public static String reverse1(String  str){
        String result = "";
        for (int i = str.length()-1 ; i>=0; i--){
            result +=str.charAt(i);
        }
     return result;
 }






}

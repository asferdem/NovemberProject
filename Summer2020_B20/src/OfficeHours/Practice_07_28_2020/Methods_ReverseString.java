package OfficeHours.Practice_07_28_2020;

public class Methods_ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("Fatih").toUpperCase());

          isPalindrome("level");

        System.out.println("=========================================");







    }
    // access-modf Specifer ReturnType name(paramaeter){Statement}
    public static String reverse(String str){
      String result="";
        for (int i=str.length()-1 ; i>=0;i--){
            result+= str.charAt(i);

        }




       return  result;
    }


      public static void isPalindrome(String str1){
        String reversestr1=reverse(str1);
        boolean palindrome=str1.equalsIgnoreCase(reversestr1);
        if (palindrome){
            System.out.println(str1+ " is palindrome");
        }else{
            System.out.println(str1+" is not palindrome");
        }

      }



}

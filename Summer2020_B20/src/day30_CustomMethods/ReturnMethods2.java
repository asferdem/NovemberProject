package day30_CustomMethods;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String name="Level";
        String reverseName=reverse2(name);
        System.out.println(reverseName);

        System.out.println(name.equalsIgnoreCase(reverse2(name)));

    }

   public static void reverse1(String str){
       String result="";
       for (int i=str.length()-1;i>= 0 ; i--){
           result+=str.charAt(i);
       }
       System.out.println(result);

   }

    public static String reverse2(String str){
        String result="";
        for (int i=str.length()-1;i>= 0 ; i--){
            result+=str.charAt(i);
        }
        return result;

    }







}

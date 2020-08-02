package OfficeHours.Practice_07_14_2020;

public class Unique {
    public static void main(String[] args) {
        String str = "ABABCD";
        String result="";//C


       for (int j=0 ;j<=str.length()-1;j++) {
           char ch = str.charAt(j);
           int count = 0;
           for (int i = 0; i <= str.length() - 1; i++) {
               char each = str.charAt(i);
               if (ch == each) {
                   count++;
               }
           }
           if (count == 1) {
               result += ch;
           }
       }

        System.out.println(""+result);
    }
}

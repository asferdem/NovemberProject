package OfficeHours.practice_07_13_2020;

public class Frequence_Characters {
    public static void main(String[] args) {

        String  str="OOPQQ"; // O2P1Q2 EXPECTED RESULT
        String remove="";    // "OPQ"

       for (int i= 0 ; i<=str.length()-1; i ++) {
           String  s=""+str.charAt(i);// O O P Q Q

           if (!remove.contains(s)){
               remove +=s;
           }
       }
       String result="";
      for ( int j = 0; j<=remove.length()-1;j++){
          int count= 0;
       char  ch1 =remove.charAt(j);
       for (int i = 0 ; i<=str.length()-1 ;i++){
        char each=str.charAt(i);
         if (each==ch1) {
             count++;
         }
         }
          result += ""+ch1+count;
        }

        System.out.println(result);

    }
}

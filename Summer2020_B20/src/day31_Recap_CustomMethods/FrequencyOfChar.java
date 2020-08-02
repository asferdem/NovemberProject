package day31_Recap_CustomMethods;
import Library.Util;
public class FrequencyOfChar {
    public static void main(String[] args) {
        String str="AABBCCC";

        String expResult="";// A2B3C3

        String nondup=Util.removeDup(str);  //   ABC


        for (char each:nondup.toCharArray()){

            int count1=Util.frequency(str,each);//2
            expResult+=""+each+count1;
        }
       /*
        char ch1=nondup.charAt(0);//A
        int count1=Util.frequency(str,ch1);//2
        expResult=""+ch1+count1;

        char ch2=nondup.charAt(1);//B
        int count2=Util.frequency(str,ch2);//2
        expResult=""+ch2+count2;

        char ch3=nondup.charAt(2);//C
        int count3=Util.frequency(str,ch3);//2
        expResult=""+ch3+count3;

        */

        System.out.println(expResult);
        System.out.println("====================================");
        String  str2="aaafffffffffffffsssssssseeeeeeeerrrrrrrrrrtttttttttgggggg";
        String result=frequencyOfChars(str2);
        System.out.println(result);




    }

    public static String frequencyOfChars(String str){
        String expResult="";// A2B3C3

        String nondup=Util.removeDup(str);  //   ABC


        for (char each:nondup.toCharArray()){

            int count1=Util.frequency(str,each);//2
            expResult+=""+each+count1;
        }
        return expResult;
    }

}

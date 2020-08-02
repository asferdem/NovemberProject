package Library;

import java.util.Arrays;

// import Library.Util;
public class Util {
    public static String  removeDup(String str) {//abab
        String nondup = "";
        for (String each : str.split("")) {
            if (!nondup.contains(each)) {
                nondup += each;
            }
        }
        return nondup;

    }

    public static int frequency(String str,char ch){
        int count = 0;
        char [] arr=str.toCharArray();
        for (char each : arr){
            if (each==ch){
                count++;
            }
        }
        return  count;
    }

    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }

    public  static  String uniques(String str) {
        String uniqes="";

        //str.toCharArray();

        for (char each:str.toCharArray() ){

            int count =frequency(str,each);

            if (count==1){
                uniqes +=each;
            }
        }
        return uniqes;

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

    public  static String formatFullName(String first,String last){
        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last= last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName=(first+" "+last);
        return  fullName;
    }






    public static int maxNum(int[] arr){
        int max=arr[0];
        for (int each: arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static Integer maxNum(Integer[] arr){
        Integer max=arr[0];
        for (Integer each: arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static double maxNum(double[] arr){
        double max=arr[0];
        for (double each: arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static Double maxNum(Double[] arr){
        Double max=arr[0];
        for (Double each: arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }


    public static int minNum(int[] arr){
        int min=arr[0];
        for (int each: arr){
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    public static Integer minNum(Integer[] arr){
        Integer min=arr[0];
        for (Integer each: arr){
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    public static double minNum(double[] arr){
        double min=arr[0];
        for (double each: arr){
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    public static Double minNum(Double[] arr){
        Double min=arr[0];
        for (Double each: arr){
            if (each<min){
                min=each;
            }
        }
        return min;
    }



    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }
        for(int each : arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }

    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for(String each  :  arr1){
            arr3[i] = each;
            i++;
        }
        for(String each : arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }

    public static double[] combine2Arrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length];

        int i = 0;
        for(double each  :  arr1){
            arr3[i] = each;
            i++;
        }
        for(double each : arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }

    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];

        int i = 0;
        for(char each  :  arr1){
            arr3[i] = each;
            i++;
        }
        for(char each : arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for(Integer each  :  arr1){
            arr3[i] = each;
            i++;
        }
        for(Integer each : arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for(Double each  :  arr1){
            arr3[i] = each;
            i++;
        }
        for(Double each : arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }

    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
       Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for(Character each  :  arr1){
            arr3[i] = each;
            i++;
        }
        for(Character each : arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }



    public static int[] addElement(int[] arr,int num){

        int[] arr2=new int[arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;

        for(int each: arr){
            arr2[i]=each;
            i++;
        }
        return arr2;
    }

    public static double[] addElement(double[] arr,double num){

        double[] arr2=new double[arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;

        for(double each: arr){
            arr2[i]=each;
            i++;
        }
        return arr2;
    }

    public static char[] addElement(char[] arr,char num){

        char[] arr2=new char[arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;

        for(char each: arr){
            arr2[i]=each;
            i++;
        }
        return arr2;
    }

    public static String[] addElement(String[] arr,String num){

        String[] arr2=new String[arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;

        for(String each: arr){
            arr2[i]=each;
            i++;
        }
        return arr2;
    }

    public static Integer[] addElement(Integer[] arr,Integer num){

        Integer[] arr2=new Integer[ arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;

        for(Integer each: arr){
            arr2[i]=each;
            i++;
        }
        return arr2;
    }

    public static Double[] addElement(Double[] arr,Double num){

        Double[] arr2=new Double[ arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;

        for(Double each: arr){
            arr2[i]=each;
            i++;
        }
        return arr2;
    }

    public static Character[] addElement(Character[] arr,Character num){

        Character[] arr2=new Character[ arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;

        for(Character each: arr){
            arr2[i]=each;
            i++;
        }
        return arr2;
    }



    public static int[] sortDescending(int[] arr){
        Arrays.sort(arr);

        int[] arr2=new int[arr.length];
        int k=arr.length-1;
        for (int i=0;i<=arr2.length-1;i++){
            arr2[i]=arr[k];//5
            k--;
        }
        return arr2;
    }

    public static double[] sortDescending(double[] arr){
        Arrays.sort(arr);

        double[] arr2=new double [arr.length];
        int k=arr.length-1;
        for (int i=0;i<=arr2.length-1;i++){
            arr2[i]=arr[k];//5
            k--;
        }
        return arr2;
    }

    public static char[] sortDescending(char[] arr){
        Arrays.sort(arr);

        char[] arr2=new char[arr.length];
        int k=arr.length-1;
        for (int i=0;i<=arr2.length-1;i++){
            arr2[i]=arr[k];//5
            k--;
        }
        return arr2;
    }

    public static String[] sortDescending(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }

    public static Integer[] sortDescending(Integer[] arr){
        Arrays.sort(arr);

        Integer[] arr2=new Integer [arr.length];
        int k=arr.length-1;
        for (int i=0;i<=arr2.length-1;i++){
            arr2[i]=arr[k];//5
            k--;
        }
        return arr2;
    }

    public static Double[] sortDescending(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2=new Double [arr.length];
        int k=arr.length-1;
        for (int i=0;i<=arr2.length-1;i++){
            arr2[i]=arr[k];//5
            k--;
        }
        return arr2;
    }

    public static Character[] sortDescending(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2=new Character[arr.length];
        int k=arr.length-1;
        for (int i=0;i<=arr2.length-1;i++){
            arr2[i]=arr[k];//5
            k--;
        }
        return arr2;
    }









}

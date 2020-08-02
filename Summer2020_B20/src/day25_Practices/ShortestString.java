package day25_Practices;
/*
Write a program that can return the longest string of text from a String array
 Write a program that can return the shortest string of text from a String array
 */
public class ShortestString {
    public static void main(String[] args) {

        String [] arr ={"Anna","Nickolas","Amir","Nurmehmet"};

        int minLength = arr[0].length();

        for (String each : arr){

            if (each.length()<minLength){
                minLength=each.length();
            }
        }
        for (String each : arr){
            if (each.length()==minLength){
                System.out.println(each);
            }
        }



    }
}

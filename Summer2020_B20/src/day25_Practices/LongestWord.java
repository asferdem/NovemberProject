package day25_Practices;

public class LongestWord {
    public static void main(String[] args) {

        String [] arr ={"Anna","Nickolas","Amir","Nurmemet"};


        int maxLength = arr[0].length();
        for ( String each : arr){
            if (each.length()>maxLength){
                maxLength=each.length();
            }
        }
        for ( String each : arr) {

            if (each.length()==maxLength){
                System.out.println(each);
            }


        }



    }
}

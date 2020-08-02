package day25_Practices;

public class Shortest2 {
    public static void main(String[] args) {

        String [] arr ={"Anna","Nickolas","Amir","Nurmehmet"};

        int minLength = arr[0].length();

        for (int i = 0 ; i <=arr.length-1 ; i ++){
            int l= arr[i].length();
            if (l<minLength){
                minLength=l;
            }
        }
        for (int i = 0 ; i <=arr.length-1 ; i ++){
            if (arr[i].length()==minLength){
                System.out.println(arr[i]);
            }
        }










    }
}

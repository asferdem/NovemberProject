package day19_For_Loop_break;

public class Alphabet {
    public static void main(String[] args) {

        //char letter = 65;
        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (int i = 65 ; i <=90 ; i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("===================================");
        for (char ch = 'Z' ; ch>='A';--ch ){

            System.out.print(ch+ " ");
        }
        System.out.println();
        for(int i =122; i>=97;--i){
            System.out.print((char)i+" ");

        }
        System.out.println();
        System.out.println("============================================");

    }
}

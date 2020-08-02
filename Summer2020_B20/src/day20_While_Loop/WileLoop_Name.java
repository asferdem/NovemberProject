package day20_While_Loop;

public class WileLoop_Name {
    public static void main(String[] args) {

        int num = 1;
        while (num<=5){
            System.out.print("FATIH ");
            num++;
        }
        System.out.println();
        System.out.println("==============================================");


        String str = "Cybertek School";
        //            01234567

        int l =str.length()-1;
        String result="";

        while (l >= 0){

            result +=""+str.charAt(l);

            l--;
        }
        System.out.println(result);










    }
}

package day29_CustomMethads;

public class RemoveDuplicate {
    public static void main(String[] args) {
       String str="abababacccccccccccccccccccccdddddd";


        removeDup(str);
    }














    public static void removeDup(String str){//abab
       String nondup="";
       for (String each :str.split("")){
           if (!nondup.contains(each)){
               nondup+=each;
           }
       }
        System.out.println(nondup);

    }


}

package day09_ifElse_Statement;
 /*
        1. write a java program that accepts three numbers and return the maximum number
          (assume that none of them are equal)
         2. write a java program that accepts three numbers and return the minimum number
         (assume that none of them are equal)
         3. write a java program that accepts three numbers and rteurn the mediam number
         (assume that none of them are equal)
         4. write a java program that can identify if a person is eligible to buy alcohol/*
  */
public class task4alcohol {
     public static void main(String[] args) {
         boolean hasId = true;
         int age = 19;
         boolean eligible = hasId && age >= 21 ;// true && false ==> false
         String result = " ";

         if (eligible== true){
             // System.out.println( "is person eligible to buy alcohol ");
             result = "is person eligible to buy alcohol ";
                     }
         if (eligible== false){
            // System.out.println("is not eligible to buy your alcohol");
               result = "is not eligible to buy your alcohol";

         }

         System.out.println(result);
     }

}

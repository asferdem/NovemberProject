package day24_Arrays;
/*
write a program that can find the unique characters from a String
		Ex:
			input: aabccd
			output: bd
 */
public class UniqueCharacter {
    public static void main(String[] args) {

        String str =" aabccd";
        String uniq="";

   for (int i = 0 ; i<=str.length()-1; i ++){

       char ch= str.charAt(i);
       int first= str.indexOf(ch);
       int last= str.lastIndexOf(ch);
       if (first==last){
           uniq+= ch;
       }

   }
        System.out.println(uniq);

    }
}

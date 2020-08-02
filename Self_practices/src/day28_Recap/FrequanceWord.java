package day28_Recap;
/*
 write a program return the frequency of a word from a string
			ex:
				str = "JavajavaJAVA";
				word = "java";
				output:
					3

	do not use same the approach we did in last office hour
 */

public class FrequanceWord {
    public static void main(String[] args) {
        String str = "javajavajavajavajava";
               str=str.toLowerCase();
        String w="java";
        int count= 0;

        for(int i= 0;i<=str.length()-4;i++){

            if (str.substring(i,i+4).equalsIgnoreCase(w)){
                count++;

            }
        }
        System.out.println(count);
    }
}

package day28_Recap;
/*
write a program that can count the frequency of a word from an array of string
			Ex:
				arr: {"Java", "C#", "Python", "Java"};
				word: "java"
				output:
						2
 */
public class FrequencyArray {
    public static void main(String[] args) {

        String[] arr={"Java", "C#", "Python", "Java","JAVA"};
        String word="java";
        int count = 0;

        for (String each : arr){
            if (!word.equalsIgnoreCase(each)){
                continue;
            }
            count++;
        }
        System.out.println(count);



    }
}

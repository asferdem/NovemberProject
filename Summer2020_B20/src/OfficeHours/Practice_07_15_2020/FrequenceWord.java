package OfficeHours.Practice_07_15_2020;

public class FrequenceWord {
    public static void main(String[] args) {
        String word="Cat Cat dog dog dog";
        int count =0;

       while (word.contains("Cat")){
            count++;
            word=word.replaceFirst("Cat","");
        }

        System.out.println(count);
       int count1=0;
        while (word.contains("dog")){
            count1++;
            word=word.replaceFirst("dog","");
        }

        System.out.println(count1);
        System.out.println(count==count1);
    }
}

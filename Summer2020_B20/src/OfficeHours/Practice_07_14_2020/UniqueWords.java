package OfficeHours.Practice_07_14_2020;

public class UniqueWords {
    public static void main(String[] args) {
        String[] word={"Java","C#","Python","Python","C#","C#","Fatih"};

        for (String b :word){
            //String s= b;
            int count =0;
            for (String each : word){
                if (each.equals(b)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(b);
            }

        }




    }
}

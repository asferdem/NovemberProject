package day25_Practices;
/*
Write a program that will take five Strings and save them into an array called arr.
 and  Use for loop to print out the first three letter of each element of arr, one per line.
You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban

 */
public class StringArrays_3Charecter {
    public static void main(String[] args) {
        String[] word= {"Apple","Banana","Strawbery","Java","Python"};


        for (String each : word) {

            System.out.print(each.substring(0, 3));
        }
        System.out.println();
        System.out.println("============================================");
        for (int i = 0 ;i <=word.length-1;i++){

            System.out.print(word[i].substring(0, 3));

        }
    }
}

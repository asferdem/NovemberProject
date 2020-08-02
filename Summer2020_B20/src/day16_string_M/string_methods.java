package day16_string_M;

import java.sql.SQLOutput;

public class string_methods {
    public static void main(String[] args) {
        String email= "cybertek@gmail.com";
        email=email.replace("gmail","yahoo");
        System.out.println(email);
        String sentence="I like to learn Java, Java is cool, Java is fan";
        sentence= sentence.replace("a, Java","a, C#");

        sentence = sentence.replace("Java ","Python ");

        System.out.println(sentence);


        String s1 = "I like to stay in Cybertek, Cybertek is nice place";
          s1 = s1.replace("Cybertek","MIT");

        System.out.println(s1);
        s1=s1.replace("MIT","Cybetek");
        System.out.println(s1);
      //replaceFirst
    String s3="i like drink tea and tea";
    s3=s3.replaceFirst("tea","Coke");
        System.out.println(s3);

    String s4="I like to watch Game of thrones, and Walking dead";
    s4=s4.replaceFirst(", and Walking dead","");
        System.out.println(s4);

 // indexof()
        String s5= "I like to stay in cybertek, we are learning java";
        int r1=s5.indexOf("r");
        System.out.println(r1);
        int r2=s5.indexOf("re");
        System.out.println(s5.charAt(r1));
        System.out.println(r2);
        System.out.println(s5.charAt(r2));
//lastIndexOf()
        String s6= "Java is a programming language, and Java is fun";
        int I2= s6.indexOf("Java is fun");
        int I1= s6.lastIndexOf("J");
        System.out.println(I1);
        System.out.println(I2);


    }
}

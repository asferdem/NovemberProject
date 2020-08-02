package day15_String;

public class String_Methods {
    public static void main(String_substring_methods[] args) {
        String name = "Cybertek School is a great place";
        //             012345678
        // cahrAt(index):
       char ch1 =name.charAt(0);//C
       char ch2 = name.charAt(5);//t
        System.out.println(ch1);
        System.out.println(ch2);

        //length()

        int l= name.length();
        System.out.println(l);// 15
        int lastIndexNumber= name.length()-1;//14
        System.out.println(lastIndexNumber);
        char ch3=name.charAt(lastIndexNumber);
        System.out.println(ch3);// l

        //concate(str)
        String schollName= "Cybertek";
        schollName=schollName.concat(" School");// "Cybertek School"

        System.out.println(schollName);// Cybertek School
        String r1= "Cybertek"+123+true;
        //toLowerCase ();

        String name1= "CYBERTEK SCHOOL";
        String name2 =name1.toLowerCase();// cybertek school
        System.out.println(name1);
        System.out.println(name2);

        //toUpperCase();

        String name3= "fatih";
                 name3=name3.toUpperCase();// FATIH
        System.out.println(name3);

        //trim();
        String r = "     Cybertek School      ";

         r =r.trim();//Cybertek School

        System.out.println(r);
        //substring();





    }
}

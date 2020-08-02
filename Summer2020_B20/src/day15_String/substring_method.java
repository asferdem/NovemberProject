package day15_String;

public class substring_method {
    public static void main(String[] args) {
        String sentences="Java is fun";

        String word1=sentences.substring(0,4);
        System.out.println(word1);

        String  word2=sentences.substring(8,11);
        System.out.println(word2);
        System.out.println("=====================================");
        String sentences2 =" I like Movies and TV Series";
        String word3 =sentences2.substring(7,13);
        System.out.println(word3);
        System.out.println("=====================================");

        String firstName= "sananananksnsjaduasgdukas";
        String firstCharacter= firstName.substring(0,1);//f
        String rest=firstName.substring(1,firstName.length());

        firstName= firstCharacter.toUpperCase()+rest.toLowerCase();//
        System.out.println(firstCharacter);
        System.out.println(firstName);

        System.out.println("========================================");
        String lastName= "school";
        String firstChar= lastName.substring(0,1);//s
        String rset1= lastName.substring(1);//chool
        System.out.println(firstChar);
        System.out.println(rset1);


        lastName =firstChar.toLowerCase()+rset1.toLowerCase();
        System.out.println(lastName);//School;
        System.out.println("========================================");

        String s= "I like Game Of Thrones";

        String series=s.substring(7);
        System.out.println(series);
        series=series.toUpperCase();
        System.out.println(series);



















    }
}

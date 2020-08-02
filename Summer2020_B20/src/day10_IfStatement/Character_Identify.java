package day10_IfStatement;

public class Character_Identify {
    public static void main(String[] args) {
        char character = '@';
        boolean IsAlphabetic = (character >=65 && character <= 90)||( character>=97 &&character<=122);

        boolean IsDigit = (character >=48 && character<= 57) ;

        boolean special = !IsAlphabetic && !IsDigit ;

        String alphabet = "";

        if ( IsAlphabetic==true){
            //System.out.println(character +" is a Alphabetic Character ");
        alphabet = character +" is a Alphabetic Character";
        }else {
            //System.out.println(character + " is not Alphabetic Character ");
            alphabet = character + " is not Alphabetic Character ";
        }
        System.out.println(alphabet);

        String digit = "";
        if (IsDigit== true){
            digit = character + " is digit";
        }else {
            digit = character+" is not digit";
        }
        System.out.println(digit);

        String SpecialCharacter = "";

        if (special == true){
            SpecialCharacter= character+ " is a special Character";

        }
        else{
            SpecialCharacter = character+ " is not a special Character";
        }
        System.out.println(SpecialCharacter);

    }
}

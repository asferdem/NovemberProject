package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigitLetters {
    public static void main(String[] args) {

        ArrayList<Character> chars= new ArrayList<>();

        chars.addAll(Arrays.asList('a','b','c','3','4','5','6','$','%','@','#','*','?'));
        System.out.println(chars);
        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);
        System.out.println("==========================================");

        ArrayList<Character> list= new ArrayList<>();

        list.addAll(Arrays.asList('a','b','c','3','4','5','6','$','%','@','#','*','?'));

        ArrayList<Character> digits= new ArrayList<>();
         digits.addAll(list);
         digits.removeIf(p-> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> letter= new ArrayList<>();

        letter.addAll(list);
        letter.removeIf(p-> !Character.isLetter(p));
        System.out.println(letter);

        ArrayList<Character> specialChar= new ArrayList<>();
        specialChar.addAll(list);

        //specialChar.removeIf(p-> Character.isLetter(p)||Character.isDigit(p));
        specialChar.removeAll(letter);
        specialChar.removeAll(digits);
        System.out.println(specialChar);











    }
}

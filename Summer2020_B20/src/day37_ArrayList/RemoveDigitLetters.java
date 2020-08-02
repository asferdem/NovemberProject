package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigitLetters {
    public static void main(String[] args) {

        ArrayList<Character> chars= new ArrayList<>();

        chars.addAll(Arrays.asList('a','b','c','3','4','5','6','$','%','@','#','*'));
        System.out.println(chars);
        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);
    }
}

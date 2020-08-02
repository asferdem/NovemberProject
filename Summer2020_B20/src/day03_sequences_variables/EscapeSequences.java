package day03_sequences_variables;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Hello Everyone \nMy name is Fatih ERDEM");
// \n start new line
        System.out.println("Hello everyone \n\tMy Name is Fatih ERDEM");
        System.out.println("\tI am in New Jersey\n");
        System.out.println("\t\t\tI love programing");
        // \t paragraph space
        System.out.println("\\");// one back slash
        System.out.println("\\\\");// two
        System.out.println("/");
        System.out.println("My name is \'Fa\'tih\'"); // single quotes
        System.out.println("My name is 'Fatih'");
        System.out.println("\"My surname is \"ERDEM\"\"");
        System.out.println("My favorite Tv-series:\"Game of Thrones\"");
    }

}

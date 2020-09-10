package day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException {

    public InvalidBrowserNameException(String str){
        super(str);

    }


}

class Test1{
    public static void main(String[] args) {


        throw new InvalidBrowserNameException("Please give valid browser !");
    }
}
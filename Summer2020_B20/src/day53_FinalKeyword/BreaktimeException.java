package day53_FinalKeyword;

public class BreaktimeException extends RuntimeException {// custom unchecked exception

        public BreaktimeException(){
            super("it is time for a break");
            System.err.println("Time to go home ");// err print red
        }
    public BreaktimeException(String  str){
        super(str);

    }


}

class Test{
    public static void main(String[] args) {
        //throw new RuntimeException("This is Runtime exception");

        throw new BreaktimeException();

       // throw new Test();


    }
}

package day29_CustomMethads;
/*
 step 1 Print hello world 5 times
 step 2 print your school name
 step 3 Print hello world 5 times
 Step 4 print your name
 step 5 3 Print hello world 5 times
 */
public class MethodsWithoutParameters1 {
    public static void main(String[] args) {

        printhello5x();
        System.out.println("Cybertek");
        printhello5x();
        System.out.println("Fatih");
        printhello5x();
    }



    public static void printhello5x(){
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hello world");
        }
    }
}

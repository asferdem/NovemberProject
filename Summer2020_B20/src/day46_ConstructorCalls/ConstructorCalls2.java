package day46_ConstructorCalls;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("A");
    }
    public ConstructorCalls2(int a){
        //ConstructorCalls2();
        this();
        System.out.println("B");
    }
    public ConstructorCalls2(String str){
        this(4);
        System.out.println("C");
    }

    public ConstructorCalls2(char a){
        this();
        System.out.println("D");

    }
    public ConstructorCalls2(double a){
        //System.out.println("E"); must first this();
        this(10);
    }

    public static void main(String[] args) {
        //new ConstructorCalls2(10); A B
        new ConstructorCalls2("abc");//A B C

        new ConstructorCalls2(('a'));// A D





    }
}

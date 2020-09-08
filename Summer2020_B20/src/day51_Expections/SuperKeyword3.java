package day51_Expections;
class C{
    public C(int a){
        System.out.println("Super class int arg constructor");
    }

}



public class SuperKeyword3 extends C {

    public SuperKeyword3(int a){
        super(300);// we have to call super class
        System.out.println("Sub class cons with arg");
    }

    public static void main(String[] args) {

        new SuperKeyword3(150);

    }

}

package day51_Expections;
class B{
    public B(){
        System.out.println("Default Constructor");
    }

}


public class SuperKeyword2 extends B {

    public SuperKeyword2(){
        //  super();  //it comes super class B constructor
        System.out.println("Sub class default constructor");

    }


    public static void main(String[] args) {
        new SuperKeyword2();

    }

}

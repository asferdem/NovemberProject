package day51_Expections;

class Test {
    int a;//200

    public void method() {
        System.out.println("Hello");
    }
}
public class SuperKeyword extends Test{
    // a=300;
    public void print1(){
        System.out.println(a);//300

    }

    public void print2(){
        System.out.println(super.a);//200
    }

    public void method2(){
        super.method();
        System.out.println("hola");
    }

    public static void main(String[] args) {
        Test onj1=new Test();
        onj1.a=200;

        SuperKeyword obj2=new SuperKeyword();
        obj2.a=300;

        obj2.print1();//300

        obj2.print2();//200




    }
}

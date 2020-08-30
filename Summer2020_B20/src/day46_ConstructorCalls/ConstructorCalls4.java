package day46_ConstructorCalls;

public class ConstructorCalls4 {

    public  ConstructorCalls4(){
        //this(); you must call another constructor
    }
    public  ConstructorCalls4(int a){
       this(2.5);
    }
    public  ConstructorCalls4(double a){
       // this(10);
    }
}

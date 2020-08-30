package day45_ConstructorContinue;

public class Sum {

    public Sum (int a,int b){
        int sum=a+b;
        System.out.println("Sum :"+sum);
    }
    public Sum(double a,double b){
        double sum=a+b;
        System.out.println("Sum :"+sum);
    }
    public Sum (int a,int b,int c){
        int sum=a+b+c;
        System.out.println("Sum :"+sum);
    }
    public Sum(double a,double b,double c){
        double sum=a+b+c;
        System.out.println("Sum :"+sum);

    }

    public static void main(String[] args) {

        Sum s1=new Sum(10,20);
        Sum s2=new Sum(10,20,30);
        new Sum(10.0,20.0);
        new Sum(10.0,20.0,30.0);



    }

}

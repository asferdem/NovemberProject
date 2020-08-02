package day33_MethodOverloading_LocalDateTime;
/*
1. create a method that can calculate the addition of two integers
		2. create a method that can calculate the addition of two decimals
		3. create a method that can calculate the multiplication of two integers
		4. create a method that can calculate the multiplication of two decimals
 */
public class Calculate {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(addition(a,b));
        double num1 =10.0;
        double num2=20.0;
        System.out.println(addition(num1,num2));





    }
        public static int addition(int num1,int num2){
            int res=num1+num2;
            return res;
        }

        public static double addition(double num1,double num2){
        double res=num1+num2;
        return res;
        }

    public static int multiplication (int num1,int num2){
        int res=num1*num2;
        return res;
    }

    public static double multiplication (double num1,double num2){
        double res=num1*num2;
        return res;
    }




}

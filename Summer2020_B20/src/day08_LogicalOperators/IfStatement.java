package day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        if (a >b ){
            System.out.println(a + " is the maxnumber ");
        }
        if (b>a){
            System.out.println(b + " is the max number ");
                  }
        if ( a ==b ){
            System.out.println("Both are equal");
        }

        System.out.println("============================");
        boolean breakTime = false;

        if (breakTime==true) {
            System.out.println( " Take 15 minutes break !");

        }
        if (breakTime == false){
            System.out.println(" Keep Studying");
        }
        System.out.println("============================");
        boolean  Corona = true;
        if (Corona == true){
            System.out.println( " Stay at home ");
            System.out.println(" Social distance");
            System.out.println(" Buy hand sanitizer");
        }
        System.out.println("============================");
        int angle1 = 60;
        int angle2 = 120;






    }
}

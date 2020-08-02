package day07_Unary_ShortHand;

public class Shothand_Operator {
    public static void main(String[] args) {
        int a= 200;
         a+=100;
        System.out.println(a);//300
        int b = 200;
            b-=100;
        System.out.println(b);//100
        int c= 200;
            c*=2;//0.5
        System.out.println(c);//400
        double w = 400.5;
                w%=2;
        System.out.println(w);//

        int d = 200;
            d/= 2;
        System.out.println(d);//100
        int q = 100 ;
        System.out.println(q/2);//50 but q variable not change
        System.out.println(q);// 100

        int e = 22;
            e%=3;
        System.out.println(e);// 1



        System.out.println("===============================================");
        String fullname="Fatih";
             // fullname= fullname+"ERDEM";
        fullname += " ERDEM";
        System.out.println(fullname);// Fatih ERDEM

        String from = "New";
        from += " Jersey";
        System.out.println(from);// New Jersey




    }
}

package Day09;

public class VehicleRecal {
    public static void main(String[] args) {
        int model = 1998;
        if (model>=1995 && model <=1998){
            System.out.println("true");
        }else if (model>=2001&&model<=2002){
            System.out.println("true");
        }else if (model>=2004&&model<=2006){
            System.out.println("true");
        }else if (model>=2015&&model<=2017){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

package Day09;

public class vehicleRecal2 {
    public static void main(String[] args) {
        int vehicleModel = 2019;
        boolean eligible = (vehicleModel>= 1995 && vehicleModel <= 1998) || (vehicleModel >= 2001 && vehicleModel <= 2002) ||
                (vehicleModel >= 2004 && vehicleModel <= 2006) || (vehicleModel >= 2015 && vehicleModel <= 2017);

        if (eligible == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
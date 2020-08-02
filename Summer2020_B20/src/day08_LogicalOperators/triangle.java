package day08_LogicalOperators;

public class triangle {
    public static void main(String[] args) {
        double angle1 = 80;
        double angle2 = 60;
        double angle3 = 30 ;
        boolean valid = (angle1+angle2+angle3) == 180;
        boolean invalid = !valid;

        if (valid){
            System.out.println("VALID TRIANGLE");
        }
        if (invalid){
            System.out.println("INVALID TRIANGLE");
        }

    }
}

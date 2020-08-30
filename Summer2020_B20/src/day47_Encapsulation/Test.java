package day47_Encapsulation;

public class Test {
    public static void main(String[] args) {
        System.out.println("public");
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        System.out.println("default");
        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();


        System.out.println("private");
       // System.out.println(AccessModifiers.privateVariable);// use only same class
       // AccessModifiers.privateMethod();// use only same class
        System.out.println("====================================");

        Encapsulation obj1= new Encapsulation();
        //System.out.println(obj1.ssn);

        System.out.println(obj1.getSsn());

       obj1.setSsn(7654321);
        System.out.println(obj1.getSsn());







    }
}

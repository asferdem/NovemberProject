package Library;
import day47_Encapsulation.AccessModifiers;// manualy import

public class Test_AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);

        AccessModifiers.publicMethod();


        //System.out.println(AccessModifiers.defaultVariable);
        // default not use outside th package
       // AccessModifiers.defaultMethod();
        // defaultMethod()' is not public in 'day47_Encapsulation.AccessModifiers'. Cannot be accessed from outside package


        // System.out.println(AccessModifiers.privateVariable);// use only same class
        // AccessModifiers.privateMethod();// use only same class
    }

}

package day50_Inheritance_Overlriding;

public class Test extends AccessModifiers{

    public static void main(String[] args) {

        System.out.println(Test.publicData);
        System.out.println(Test.protectedData);
        System.out.println(Test.defaultData);

        //System.out.println(Test.privateData); only visiable within the class


    }

}
package day47_Encapsulation;

public class Test1 {
    public static void main(String[] args) {
      Credentials obj=new Credentials("Fatih",44);

      obj.setUsername("asferdem");
      obj.setPassword("sanane");

        System.out.println("Name :"+obj.name);
        System.out.println("Age :"+obj.age);
        System.out.println(obj.companyName);
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());



    }
}

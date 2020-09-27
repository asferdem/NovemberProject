package day57_Polymorphism.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("12", "5.3", 1000);
        Samsung samsung = new Samsung("S20", "6.1", 899 );
        Huawei huawei = new Huawei("Robbery", "5.3", 25);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1=new Iphone("12", "5.3", 1100 );
        Phone phone2=new Samsung("S10", "6.5", 750 );
        Phone phone3=new Huawei("Robb", "8.3", 35);

        //Iphone[] phones={iphone,phone2,phone3};
        //Samsung[] phones={phone1,samsung,phone3};
        Phone[] phones={phone1,phone2,phone3};
        Phone[] phones1={iphone,samsung,huawei};


    }
}
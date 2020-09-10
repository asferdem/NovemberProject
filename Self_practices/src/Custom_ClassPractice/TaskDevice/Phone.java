package Custom_ClassPractice.TaskDevice;

import sun.plugin2.main.client.WMozillaServiceDelegate;

/*
create a sub class of Device called Phone
                static variables: brand , OperatingSystem, made in(do not initialize them)

                instance variables:     Model, price, screenSize, touchScreen(boolean)
                add a constructor that can initialize all instances (this is should be the only constructor)
              if price is lower than $0 throw a runtime exception with a message of "Invalid Price"
                methods: call, text, toString
 */
    public class Phone extends Device {

        public static String operatingSystem;
        public static  String madeIn;
        public boolean touchScreen;
        public Phone(String model, double price, double screenSize,boolean touchScreen){
            super(model, price, screenSize);
            this.touchScreen=touchScreen;

            if (price<0){
            throw new RuntimeException("Invalid Price");
        }
    }

    public void call(){
        System.out.println("Phone called");
    }
    public void text(){
        System.out.println("Phone texted");
    }


    public String toString() {
        return "Phone{" +
                "touchScreen=" + touchScreen +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                '}';
    }
}

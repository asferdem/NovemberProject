package Custom_ClassPractice.TaskDevice;
/*
create a class called Device
                Attributes: brand (static & do not initialize)
                            Model, price, screenSize
                            create a constrcutor that can initialize the instances
 */
public class Device {
  public static String brand;
  public String model;
  public double price;
  public double screenSize;

    public Device(String model, double price, double screenSize) {
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }


}

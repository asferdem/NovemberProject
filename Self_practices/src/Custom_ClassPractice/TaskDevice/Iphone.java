package Custom_ClassPractice.TaskDevice;

public class Iphone extends Phone{

    public Iphone(String model, double price, double screenSize,boolean touchScreen){
        super(model, price, screenSize, touchScreen);
        if (price>1500){
            throw new RuntimeException("Iphone price cannot be higher than $1500");
        }
    }
    static {
        brand = "Iphone";
        operatingSystem = "IOS";
        madeIn = "USA";
    }
    public void text(){
        super.text();
    }
}

package day56_Abstractions.PhoneAbstractTask;

public final class Samsung extends Phone {
    public Samsung( String model, double price, String size) {
        super("Samsung", model, price, size);
        if (price<=0 || price>200){
            throw new RuntimeException("Invalid Price :"+price);
        }
    }

    @Override
    public void calling(long phoneNUmber) {
        System.out.println("Samsung is calling "+ phoneNUmber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNUmber) {
        System.out.println("Samsung is texting to "+ phoneNUmber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }

    public  void freezing(){
        System.out.println("samsung is Freezing");
    }

    @Override
    public String toString() {
        return "Samsung Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}

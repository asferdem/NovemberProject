package Custom_ClassPractice;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public  Item(String name,double unitPrice,int quantity){

        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;

    }
    public double calcCost(){
        double totalCost=quantity*unitPrice;

        return totalCost;
    }


    public String toString(){
        return "Name: "+name+" Unit Price: "+unitPrice+" Quantity: "+quantity+calcCost();
    }
}

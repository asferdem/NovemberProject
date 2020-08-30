package OfficeHours.Practice_08_19_2020;

public class Pizza {


     String size;
     int numOfCheeseTopping;
     int numOfPepperoniTopping;

    public void set(String size,int numOfCheeseTopping,int numOfPepperoniTopping){
        this.size=size;
        this.numOfCheeseTopping=numOfCheeseTopping;
        this.numOfPepperoniTopping=numOfPepperoniTopping;

    }

    public double calcost(){
        double cost=0;
        if (size.equalsIgnoreCase("small")){
          cost=10+(numOfCheeseTopping*2)+(numOfPepperoniTopping*2);
        }else if(size.equalsIgnoreCase("Medium")){
            cost=12+(numOfCheeseTopping*2)+(numOfPepperoniTopping*2);
        }else{
            cost=14+(numOfCheeseTopping*2)+(numOfPepperoniTopping*2);
        }
        return cost;
    }

    public String toString(){
        return "Pizza Size: "+size+"\nCheese Topping: "+numOfPepperoniTopping+"\nPepperoni Topping: "+numOfPepperoniTopping+
                "\nTotal Price : $"+calcost();
    }
}

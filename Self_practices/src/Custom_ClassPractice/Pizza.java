package Custom_ClassPractice;
/*
Create a class named Pizza that stores information about a single pizza.
        Attributes:
            size, NumOfCheeseTopping, NumOfPepperoniTopping
        Actions:
            set(): sets all info of the pizza
            calcCost(): calculates the price and returns it as double
            toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
            Pizza cost is determined by:
                    Small: $10 + $2 per topping
                    Medium: $12 + $2 per topping
                    Large: $14 + $2 per topping
 */
public class Pizza {
    String size;
    int numOfCheeseTopping;
    int numOfPepperoniTopping;
    public void set(String size, int numOfCheeseTopping,int numOfPepperoniTopping){
        this.size=size;
        this.numOfCheeseTopping=numOfCheeseTopping;
        this.numOfPepperoniTopping=numOfCheeseTopping;

    }
    public double calcCost(){
        double cost=0;
        if (size.equals("Small")){
            cost=10+(numOfPepperoniTopping*2)+(numOfCheeseTopping*2);
        }else if (size.equals("Medium")){
            cost=12+(numOfPepperoniTopping*2)+(numOfCheeseTopping*2);

        }else{
            cost=14+(numOfPepperoniTopping*2)+(numOfCheeseTopping*2);

        }

        return cost;
    }
    public String toString(){

        return "Pizza Size: "+size+"\nNumber Of Cheese Topping: "+numOfCheeseTopping+"\nNumber Of Pepperoni Topping : "+numOfPepperoniTopping+
                "\nTotal Price : $"+calcCost();
    }

}

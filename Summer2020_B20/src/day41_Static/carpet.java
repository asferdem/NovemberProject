package day41_Static;
/*
instance variables:
                 width, length, unitPrice, isPersian (boolean)
           instance methods:
    customOrder(): sets the carpet' width, length, unitprice, & isParsian
    calcCost(): should be able to caculate the total cost of the carpet and return it as double
    getCarpetInfo(): should be able to display all the info of the carpet
    including the total cost of the carpet as calculated by calcCost()
    total price of carpet= (width*length)*unitprice
 */
public class carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public  void customOrder(double width,double length, double unitPrice,boolean isPersian){
        this.width= width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;
    }

    public  double calCost(){

       double totalPrice=(width*length)*unitPrice;

       if (isPersian){
           totalPrice+=200;
       }
       return totalPrice;
    }
    public void getCarpetInfo(){
        System.out.println("================================");

        System.out.println("Width : "+width );
        System.out.println("Length : "+length );
        System.out.println("Unit Price: "+unitPrice);
        System.out.println("Is Persian : "+isPersian);
        System.out.println("Total Price : "+calCost() );

        System.out.println("================================");
    }


}

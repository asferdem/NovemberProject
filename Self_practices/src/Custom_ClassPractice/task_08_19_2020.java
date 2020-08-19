package Custom_ClassPractice;

public class task_08_19_2020 {
    public static void main(String[] args) {
        Pizza order1=new Pizza();
        order1.set("Small",2,2);

        order1.calcCost();
        System.out.println(order1);

        Pizza order2=new Pizza();
        order2.set("Large",5,5);
        System.out.println(order2);



    }



}

package day41_toString;

import java.util.ArrayList;

/*
warmup tasks:

            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects
             ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets,
             and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets
 */
public class CarpetObject {
    public static void main(String[] args) {
        carpet[] carpets={new carpet(),new carpet(),new carpet(),new carpet(),new carpet()};

        carpets[0].customOrder(3.5,4.5,7.5,false);
        carpets[1].customOrder(4,4.5,9,true);
        carpets[2].customOrder(5,4,8,false);
        carpets[3].customOrder(6,5,7.5,true);
        carpets[4].customOrder(7,8,10,true);
        /*
        for (carpet each:carpets){
           each.getCarpetInfo();
        }


 */


        ArrayList<carpet> persianCarpets=new ArrayList<>();
        ArrayList<carpet> regularCarpets=new ArrayList<>();

        for (carpet each:carpets){

           if(each.isPersian){
               persianCarpets.add(each);
           }else{
               regularCarpets.add(each);
           }

        }
        System.out.println("number of persian carpet :"+persianCarpets.size());
        System.out.println("number of regular carpet :"+regularCarpets.size());



    }



}

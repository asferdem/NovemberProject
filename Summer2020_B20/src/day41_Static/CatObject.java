package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObject {
    public static void main(String[] args) {

        //Cat cat1=new Cat();
       // cat1.setCatInfo("Cass",11,'F',"Black","Persian");
       // System.out.println(cat1);
        Cat[] catPark={new Cat(),new Cat(),new Cat(),new Cat(),new Cat()};
        catPark[0].setCatInfo("Mavis",2,'M',"White","Van Cat");
        catPark[1].setCatInfo("Angel",3,'F',"Cloud","Persian");
        catPark[2].setCatInfo("Bihter",1,'F',"Brown","Siamese");
        catPark[3].setCatInfo("Garfield",5,'M'," Orange","Persian cat");
        catPark[4].setCatInfo("Ice",4,'M',"Mix DarkGray","Siberian Forest Cat");

        for (Cat each:catPark){
            System.out.println(each);
        }

        //System.out.println(Arrays.toString(catPark));


        ArrayList<Cat> femaleCats=new ArrayList<>();


        ArrayList<Cat> maleCats=new ArrayList<>();
        System.out.println("=======================================");
        for (int i=0; i<=catPark.length-1;i++){
           if( catPark[i].gender=='F'){
               femaleCats.add(catPark[i]);
           }else{
               maleCats.add(catPark[i]);
           }
        }
        System.out.println(femaleCats);
        System.out.println("=======================================");
        System.out.println(maleCats);

        System.out.println("=======================================");

        for (Cat each:catPark){

            if (each.gender=='M'){
                maleCats.add(each);
            }else{
                femaleCats.add(each);
            }
        }
        System.out.println(femaleCats);
        System.out.println("=======================================");
        System.out.println(maleCats);





    }
}

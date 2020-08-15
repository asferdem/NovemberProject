package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CattObjects2 {
    public static void main(String[] args) {

        Cat[] catPark={new Cat(),new Cat(),new Cat(),new Cat(),new Cat()};
        catPark[0].setCatInfo("Mavis",2,'M',"White","Van Cat");
        catPark[1].setCatInfo("Angel",3,'F',"Cloud","Persian");
        catPark[2].setCatInfo("Bihter",1,'F',"Brown","Siamese");
        catPark[3].setCatInfo("Garfield",5,'M'," Orange","Persian cat");
        catPark[4].setCatInfo("Ice",4,'M',"Mix DarkGray","Siberian Forest Cat");

        ArrayList<Cat> femaleCats1=new ArrayList<>();


        ArrayList<Cat> maleCats1=new ArrayList<>();

        femaleCats1.addAll(Arrays.asList(catPark));
        femaleCats1.removeIf(p-> p.gender=='M');

        maleCats1.addAll(Arrays.asList(catPark));
        maleCats1.removeIf(p-> p.gender=='F');

        System.out.println(femaleCats1);
        System.out.println("=======================================");
        System.out.println(maleCats1);

    }
}

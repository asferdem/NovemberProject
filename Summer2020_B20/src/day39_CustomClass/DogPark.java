package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {
    public static void main(String[] args) {

        Dog[] dogPark={new Dog(),new Dog()};

        dogPark[0].setDogInfo("Ice","Haskey","long",3,"White");
        dogPark[1].setDogInfo("Boby","Pitbull","Small",5,"Black");

        for (Dog each:dogPark){
             each.getDogInfo();
        }

    }





}

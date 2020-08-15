package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class carpetObject2 {
    public static void main(String[] args) {
        carpet[] carpets={new carpet(),new carpet(),new carpet(),new carpet(),new carpet()};

        carpets[0].customOrder(3.5,4.5,7.5,false);
        carpets[1].customOrder(4,4.5,9,true);
        carpets[2].customOrder(5,4,8,false);
        carpets[3].customOrder(6,5,7.5,true);
        carpets[4].customOrder(7,8,10,true);

        ArrayList<carpet> persianCarpets=new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p-> !p.isPersian);



        ArrayList<carpet> regularCarpets=new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
        //regularCarpets.removeIf(p-> p.isPersian);
        regularCarpets.removeAll(persianCarpets);

        System.out.println("number of persian carpet :"+persianCarpets.size());
        System.out.println("number of regular carpet :"+regularCarpets.size());
    }
}

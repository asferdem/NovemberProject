package day33_MethodOverloading_LocalDateTime;

import java.time.LocalDate;

public class datesPractice {
    public static void main(String[] args) {
        String [] names={"ali","veli","deli","erdem","fatih"};
        LocalDate[] dates={LocalDate.of(1976,11,1),LocalDate.of(1976,9,1),
                            LocalDate.of(1976,11,1),LocalDate.of(1976,12,1),
                            LocalDate.of(1976,10,1)};
        for(int i =0; i<names.length;i++){
            System.out.println(names[i]+" <==> "+dates[i]);
        }

    }
}

package day23_Arrays;

public class Arrays_practice1 {
    public static void main(String[] args) {

     // String students ="muhtar ","Nadir","asia";

        String[] students= {"muhtar","Nadir","Asiya","Fatih"};
       //                       0       1       2       3

          String name1= students[3];
        System.out.println(name1);
        System.out.println("===============================================");


        String[] names= {"Mike","Adam","Tony","John","Ammy"};

        int [] score ={85,70,95,90,100};


        System.out.println(names[0] +" : "+score[0]);
        System.out.println(names[1] +" : "+score[1]);
        System.out.println(names[2] +" : "+score[2]);
        System.out.println(names[3] +" : "+score[3]);
        System.out.println(names[4] +" : "+score[4]);

        System.out.println("==========================================");

        for (int i = 0 ; i<=4; i++){
            System.out.println(names[i]+" : "+score[i]);
        }
        System.out.println("==========================================");

        String[] classMates= new String[5];
        classMates[0]="Muhtar";
        classMates[2]="Fatih";
        classMates[1]="Ali";
        classMates[3]="Ayhan";
        classMates[4]="Ziadin";

        for (int i=0; i<=classMates.length-1;i++){

            System.out.println(classMates[i]);
        }



    }
}

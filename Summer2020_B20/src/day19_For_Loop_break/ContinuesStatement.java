package day19_For_Loop_break;

public class ContinuesStatement {
    public static void main(String[] args) {
        for (int i=1 ; i<=5 ; i++){
            if (i ==3){
                continue;

            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=====================================================");
                for (char ch= 'A'; ch<='F'; ch++){
                    if (ch=='C'|| ch =='F'){
                        continue;
                    }

                    System.out.print(ch+" ");
                }
        System.out.println();


    }
}

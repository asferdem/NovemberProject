package day20_While_Loop;

public class branchingStatements {
    public static void main(String[] args) {

        char ch = 'A';
        while (ch<='E'){

            if (ch=='C'){
                ch++;
             continue;// skip everything
               // break;
         }
            System.out.println(ch);

            ch++;
        }


        if (true){

            System.out.println("Started");
            //System.exit(0);
            System.out.println(" Done ");

        }



    }
}

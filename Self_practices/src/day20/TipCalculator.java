package day20;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double tip =0;
        double pay= 0;
        String peop="";
        System.out.println("Split: ");
        String  splt=scan.nextLine();
        System.out.println("Number of people:");
        int peopnum=scan.nextInt();
        System.out.println("Check amount:");
        double chckamnt=scan.nextDouble();
        System.out.println("Service Quality:");
        String service=scan.next();
        if (service.equals("Excellent")){
            tip=chckamnt*0.25;
        }else if (service.equals("Great")){
            tip=chckamnt*0.20;
        }else if (service.equals("Good")){
            tip=chckamnt*0.15;
        }else if (service.equals("Fair")){
            tip=chckamnt*0.10;
        }else{
            tip=chckamnt*0.05;
        }
        for (int i=1; i<=peopnum;i++){
            peop+="&";
        }
        System.out.println("Number of people entered:"+peop);
        System.out.println("Total to pay: "+(chckamnt+tip));
        System.out.println("Total tip: "+tip);
        System.out.println("Total per person: "+ (chckamnt+tip)/peopnum);
        System.out.println("Tip per person: "+ (tip/peopnum));
















    }
}

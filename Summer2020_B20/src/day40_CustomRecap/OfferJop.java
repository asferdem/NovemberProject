package day40_CustomRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferJop {
    public static void main(String[] args) {
        offer  offer1=new offer();
        offer  offer2=new offer();
        offer  offer3=new offer();
        offer  offer4=new offer();
        offer  offer5=new offer();
        offer  offer6=new offer();
        offer  offer7=new offer();
        offer1.setInfoOffer(10000,"NJ",true,true,true,"SDET",true);
        offer2.setInfoOffer(75_000,"VA",true,true, false, "SDET", true);
        offer3.setInfoOffer(125000,"VA", true, true, true, "SDET", true);
        offer4.setInfoOffer(100_000,"PA",true,false, false, "QA", true);
        offer5.setInfoOffer(100_000,"CA",true,false, false, "QA", true);
        offer6.setInfoOffer(120000,"CO",true,true,true,"Senior SDET",true);
        offer7.setInfoOffer(100_000,"GA",true,false, false, "QA", true);

        ArrayList<offer> jobOffers = new ArrayList();
        jobOffers.addAll(Arrays.asList(offer1, offer2, offer3,offer4,offer5,offer6,offer7));

        for (offer each: jobOffers){
            each.getOfferInfo();
        }
        System.out.println("========================================");

        jobOffers.removeIf( p-> p.salary<120000);
        System.out.println(jobOffers.size());




    }
}

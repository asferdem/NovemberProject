package day40_CustomRecap;
/*
  Offer
        Attribute:
            salary, Location, hasPTO, isFullTime, WFH, jobTitle, benifit
        Actions:
            setOfferInfo
            getOfferInfo
        MUST use this keyword

 */
public class offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean wfh;
    String  jopTitle;
    boolean hasBenefits;

    public void setInfoOffer(double salary,String state,boolean hasPTO,boolean isFullTime,
                             boolean wfh,String  jopTitle,boolean hasBenefits){
        this.hasBenefits=hasBenefits;
        this.hasPTO=hasPTO;
        this.isFullTime=isFullTime;
        this.wfh=wfh;
        this.jopTitle=jopTitle;
        this.state=state;
        this.salary=salary;

    }
    public void getOfferInfo(){
        System.out.println("===========================================");
        System.out.println("Jop title is: "+jopTitle);
        System.out.println("Jop State is: "+state);
        System.out.println("Is full time: "+isFullTime);
        System.out.println("Salary is: "+salary);
        System.out.println("Work for Home: "+wfh);
        System.out.println("Has PTO: "+hasPTO);
        System.out.println("Has Benefit :"+hasBenefits);
        System.out.println("===========================================");
    }


}

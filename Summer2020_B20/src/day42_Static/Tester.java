package day42_Static;

public class Tester {
    String name;
    char gender;
    long employeeID;
    String jopTitle;
    double salary;

    public void setInfo(String name,char gender,long employeeID,String jopTitle,double salary){
        this.name=name;
        this.gender=gender;
        this.employeeID=employeeID;
        this.jopTitle=jopTitle;
        this.salary=salary;
    }

    public void smokeTesting(){

        System.out.println(name+"Smoke Testing");
    }
    public void creatingTicket(){
        System.out.println(name+"is Creating Ticket");
    }
    public String toString(){
     return "Name: "+name+"Gender: "+gender+"Jop Title: "+jopTitle+"Salary : "+salary+"Employee ID: "+employeeID;
    }







}

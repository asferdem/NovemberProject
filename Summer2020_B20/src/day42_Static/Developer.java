package day42_Static;

public class Developer {
    String name;
    char gender;
    long employeeID;
    String jopTitle;
    double salary;

    public void setInfo(String name,char gender,long employeeID,String jopTitle,double salary) {
        this.name = name;
        this.gender=gender;
        this.employeeID = employeeID;
        this.jopTitle = jopTitle;
        this.salary = salary;
    }


    public void coding(){
        System.out.println(name+"is Coding");
    }
    public  void fixBug(){
        System.out.println(name+"is Bug");

    }
    public String toString(){
        return "Name: "+name+"Gender: "+gender+"Jop Title: "+jopTitle+"Salary : "+salary+"Employee ID: "+employeeID;
    }



}
package day47_Encapsulation;
/*
 create a class called CapitalOneEmployees
                instance variables:
                        employeeName
                        employeeAge
                        jobTitle
                    private ID
                    private salary
                    private address
                    company name = "Capital One"
                    generate getters & setters for private variables
 */
public class CapitalOneEmployees {
    public String employeeName;
    public int employeeAge;
    public String jobTittle;

    private int ID;
    private double salary;
    private String address;

   public static String companyName="Capital One";
    public CapitalOneEmployees(String employeeName, int employeeAge, String jobTittle) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jobTittle = jobTittle;
    }

    public int getID() { return ID; }

    public void setID(int ID) { this.ID = ID; }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String toString()
    {
        return companyName+
                "\nName: "+employeeName+
                "\nAge: "+employeeAge+
                "\nJob Title: "+jobTittle+
                "\nID: "+ID+
                "\nAnnual Salary: "+salary+
                "\nAddress: "+address;
    }
}

package day49_Inheritance.ScrumTeamTest;
/*
 create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo
 */
public class Employee extends Person {
     /*
     name,age,gender
     getSSN(),setSSN(),sleep(),setPersonInfo( name, age,gender
      */

    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name,age,gender);// it comes person class
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

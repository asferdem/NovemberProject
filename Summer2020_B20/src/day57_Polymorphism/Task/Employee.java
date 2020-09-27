package day57_Polymorphism.Task;
/*
1. create an abstract class named Employee
            Attributes: name, id, jobTitle, salary, gender
            abstract method: work
            add a constructor to initialize the fileds
    2. create a subclass of Employee named Tester
    3. create a sub class of Employee named Developer
    4. create a class named Apple:
            create an arraylist(you decide the reference type), and store 4 testers and 3 developers object
 */
public abstract class Employee {
    public String name,ID,jopTitle;
    public double salary;
    public char gender;
    public abstract void work();

    public Employee(String name, String ID, String jopTitle, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jopTitle = jopTitle;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}

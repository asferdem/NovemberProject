package day57_Polymorphism.Task;

public class Developer extends Employee{
    @Override
    public void work() {
        System.out.println("Developer "+name+" is working ");
    }

    public Developer(String name, String ID, String jopTitle, double salary, char gender) {
        super(name, ID, jopTitle, salary, gender);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}

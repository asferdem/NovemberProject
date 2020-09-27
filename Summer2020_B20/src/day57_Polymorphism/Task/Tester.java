package day57_Polymorphism.Task;

public class Tester extends Employee{

    @Override
    public void work() {
        System.out.println("Tester "+name+" is working ");
    }

    public Tester(String name, String ID, String jopTitle, double salary, char gender) {
        super(name, ID, jopTitle, salary, gender);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}

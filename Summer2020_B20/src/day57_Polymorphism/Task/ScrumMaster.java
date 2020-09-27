package day57_Polymorphism.Task;

public class ScrumMaster extends Employee{
    @Override
    public void work() {
        System.out.println("");
    }

    public ScrumMaster(String name, String ID, String jopTitle, double salary, char gender) {
        super(name, ID, jopTitle, salary, gender);
    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}

package day47_Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        CapitalOneEmployees employee1=new CapitalOneEmployees("Fatih",44,"SDET");

        employee1.setID(123);
        employee1.setSalary(100000);
        employee1.setAddress("New JERSEY");

        System.out.println(employee1.employeeName);
        System.out.println(employee1.employeeAge);
        System.out.println(employee1.jobTittle);
        System.out.println(employee1.companyName);
        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

        System.out.println(employee1);
    }
}

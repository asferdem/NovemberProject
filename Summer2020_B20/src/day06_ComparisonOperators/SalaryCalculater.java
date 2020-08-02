package day06_ComparisonOperators;

public class SalaryCalculater {
    public static void main(String[] args) {
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        int weeklyHours = 40;
        double rate= 55.0;
        double salary = 48 * weeklyHours * rate;
        double totalTax = (salary * stateTaxRate) + (salary * federalTaxRate);
        double income = salary - totalTax;

        System.out.println("Your salary is :" + salary + " USD");
        System.out.println("Your total tax is : " + totalTax + " USD");
        System.out.println("Your income after tax is : " + income + " USD");


    }

}

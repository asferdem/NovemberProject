package day45_ConstructorContinue;
/*
Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
       instance methods:
           salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
              federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)

     toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()

 */
public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;
    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return hourlyRate*weeklyHours*48;
    }
    public  double salaryAfterTax(){
        return salary()-stateTaxRate-federalTax();
    }

    public double stateTax(){
       return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public String toString(){
        return "Salary : "+salary()+"\nState Tax : "+stateTax()+
                "\nFederal Tax : "+federalTax()+"\nSalary After Tax : "+salaryAfterTax();

    }

}

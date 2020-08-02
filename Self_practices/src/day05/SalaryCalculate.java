package day05;
/*
 if: rate = 55;
                        stateTaxRate = 0.04;
                        federalTaxRate =0.22;
                        weeklyHours = 40;
                    then output will be:
                            your salary is: 105600 USD
                            your total tax is: 27456 USD
                            your income after tax is: 78144 USD
                Assume that a year has 48 weeks (excluding PTO)
 */
    public class SalaryCalculate{
    public static void main(String[] args) {
        double stateTaxRate= 0.04;
        double federalTaxRate = 0.22;
        int weeklyHours = 40;
        int rate = 55;
        double salary = 48*weeklyHours*rate;
        double totalTax = (salary*stateTaxRate)+(salary*federalTaxRate);
        double income = salary-totalTax;

        System.out.println("Your salary is :"+salary+" USD");
        System.out.println("Your total tax is : "+totalTax+" USD" );
        System.out.println("Your income after tax is : "+income+" USD");






    }
}

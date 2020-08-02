package day03_sequences_variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class salary_calculater {
    public static void main(String[] args) {
        int salary = 100000;
        double tax = 0.28;

        double totalTax =  salary*tax ;// 28000
        double salaryAfterTax = salary - totalTax;//72000

        System.out.println(salaryAfterTax);
    }







}

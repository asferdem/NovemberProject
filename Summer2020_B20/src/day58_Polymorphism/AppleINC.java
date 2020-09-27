package day58_Polymorphism;


import day57_Polymorphism.Task.*;


import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {
    public static void main(String[] args) {


        Employee[] workers = {new Tester("Fatih", "12345", "SDET", 12000, 'M'),
                new Tester("Fatih", "12345", "SDET", 12000, 'M'),
                new Tester("Fatih", "12345", "SDET", 12000, 'M'),
                new Tester("Fatih", "12345", "SDET", 12000, 'M'),
                new Tester("Fatih", "12345", "SDET", 12000, 'M'),
                new ScrumMaster("Deli", "452145", "SDET", 90000, 'M'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new ScrumMaster("Deli", "452145", "SDET", 90000, 'M'),
                new Tester("Fatih", "12345", "SDET", 12000, 'M'),
                new Tester("Fatih", "12345", "SDET", 12000, 'M'),
                new Tester("Fatih", "12345", "SDET", 12000, 'M'),
                new Tester("Fatih", "12345", "SDET", 12000, 'M'),
                new ScrumMaster("Deli", "452145", "SDET", 90000, 'M'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
                new Developer("Keli", "111111", "DEV", 90000, 'F'),
        };


        ArrayList<Employee> scrumTeam = new ArrayList<>(Arrays.asList(workers));
        int countTester=0;
        int countDeveloper=0;
        int countScrumMaster=0;
        for (Employee each: scrumTeam){
            if (each instanceof Tester){
                countTester++;
            }else if (each instanceof Developer){
                countDeveloper++;
            }else{
                countScrumMaster++;
            }
        }

        System.out.println("countTester = " + countTester);
        System.out.println("countDeveloper = " + countDeveloper);
        System.out.println("countScrumMaster = " + countScrumMaster);
    }
}
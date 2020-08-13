package day40_CustomRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount fatih=new BankAccount();
        BankAccount erva=new BankAccount();
        BankAccount aygul=new BankAccount();
        BankAccount sueda=new BankAccount();
        BankAccount zeynep=new BankAccount();


        fatih.setAccountInfo("Checking","Fatih","123654789");
        erva.setAccountInfo("Checking","Erva","123654789");
        aygul.setAccountInfo("Checking","Aygul","123654789");
        sueda.setAccountInfo("Checking","Sueda","123654789");
        zeynep.setAccountInfo("Checking","Zeynep","123654789");

        ArrayList<BankAccount> accounts=new ArrayList<>();
        accounts.addAll(Arrays.asList(fatih,erva,aygul,sueda,zeynep));

        for (BankAccount each:accounts){
            each.deposit(500);
            each.getAccountInfo();

        }

        accounts.get(3).deposit(1000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(2000);
        accounts.get(4).checkBalance();
        System.out.println("======================================================");



        accounts.removeIf(p-> p.balance<1000);
      for (BankAccount each:accounts){
          each.getAccountInfo();
      }







    }




}

package day40_CustomRecap;
/*
1. AccountHolder, 2. AccountNumber, 3. Balance
          Actions: checkBalance, deposit, withdraw
          requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance


 */
public class BankAccountTask {
    public static void main(String[] args) {

        BankAccount Dawud=new BankAccount();

        Dawud.setAccountInfo("Saving","Dawud Abdulai","123456789");
        Dawud.getAccountInfo();

        Dawud.deposit(1000);
        Dawud.checkBalance();
        Dawud.withdraw(500);
        Dawud.checkBalance();

        Dawud.withdraw(10000);
        Dawud.checkBalance();





    }




}

public class Account{
    private String holderName;
    private int accountNumber;
    private String accountType;
    private double currentBalance;

    public Account(String holderName, int accountNumber, String accountType, double currentBalance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currentBalance = currentBalance;
    }

    public void depostMoney(double depositM){
        this.currentBalance += depositM;
    }

    public void withdrawMoney(double withdrawM){
        this.currentBalance -= withdrawM;
    }

    public void displayAccountDetails(){
        System.out.println("Account Details");
        System.out.println();
        System.out.println("Account Name: " + holderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + currentBalance);
    }

    public double checkBalance(){
        return currentBalance;
    }


}
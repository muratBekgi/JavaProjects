import java.util.Scanner;

public class bank2 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter ID:");
        int Id; //Accept ID
        System.out.print("Enter New Balance:");
        int bal = 0; //Accept Balance
        Account account = new Account(bal, sc.nextDouble());

        System.out.print("Enter Annual Rate:");
        //Set annual interset rate using setAnnualInterestRate(double newAnnualInterestRate) method;

        System.out.print("Enter Withdraw Amount:");
        //Withdraw ammount from account using withdraw() method


        System.out.print("Enter Deposit Amount:");
        //Deposit amount using Deposit method

        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());

        //DO NOT UN-COMMENT THE BELOW STATEMENT OR ELSE YOU WILL LOOSE CREDITS. ITS PRESENT JUST SO YOU KNOW HOW IT IS DONE!
        //System.out.println("This account was created at " +  account.getDateCreated());
    }
}

class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate=newAnnualInterestRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = 0; //Calculate monthly Interest and return

        return monthlyInterest;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {

    }

    public void deposit(double amount) {

    }
}

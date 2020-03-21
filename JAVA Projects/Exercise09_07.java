/*
(The Account class) Design a class named Account that contains:
■ A private int data field named id for the account (default 0).
■ A private double data field named balance for the account (default 0).
■ A private double data field named annualInterestRate that stores the current interest rate (default 0).
  Assume all accounts have the same interest rate.
■ A private Date data field named dateCreated that stores the date when the
account was created.
■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.
■ The accessor and mutator methods for id,balance, andannualInterestRate.
■ The accessor method for dateCreated.
■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
■ A method named withdraw that withdraws a specified amount from the
account.
■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class and then implement the class. (Hint: The method getMonthlyInterest() is to
return monthly interest, not the interest rate. Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
 is annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to
 divide it by 100.)Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000
 and an annual interest rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to
 deposit $3,000, and print the balance, the monthly interest, and the date when this account was created.
 */


import java.util.Scanner;

public class Exercise09_07 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter ID:");
        int Id=sc.nextInt(); //Accept ID
        System.out.print("Enter New Balance:");
        int bal=sc.nextInt(); //Accept Balance
       // Account account = new Account(bal, sc.nextDouble());

        System.out.print("Enter Annual Rate:");
        double annualIntRate=sc.nextDouble(); //Set annual interset rate using setAnnualInterestRate(double newAnnualInterestRate) method;

        System.out.print("Enter Withdraw Amount:");
        double withdraw=sc.nextDouble();//Withdraw ammount from account using withdraw() method


        System.out.print("Enter Deposit Amount:");
        double deposit=sc.nextDouble();//Deposit amount using Deposit method

        Account account=new Account(Id,bal);
        account.setAnnualInterestRate(annualIntRate);
        account.withdraw(withdraw);
        account.deposit(deposit);

        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());

        //DO NOT UN-COMMENT THE BELOW STATEMENT OR ELSE YOU WILL LOOSE CREDITS. ITS PRESENT JUST SO YOU KNOW HOW IT IS DONE!
        //System.out.println("This account was created at " +  account.getDateCreated());

        /*
        System.out.print("Enter ID: ");
        int id=input.nextInt();
        System.out.print("Enter Balance: $");
        double balance=input.nextDouble();
        System.out.print("Enter Annual Interest Rate: ");
        double annualIntRate=input.nextDouble();
        System.out.print("Widthdrawing: $");
        double withdraw=input.nextDouble();
        System.out.print("Depositing: $");
        double deposit=input.nextDouble();

        Account account=new Account(id,balance);
        account.setAnnualInterestRate(annualIntRate);
        account.withdraw(withdraw);
        account.deposit(deposit);

        System.out.print("------------------------------------------\n");
        System.out.println("ID is: "+id);
        System.out.println("Current Balance is $"+account.getBalance());
        System.out.println("Monthly Interest: "+account.getMonthlyInterestRate());
        System.out.println("Date Created: "+account.getDateCreated());
        System.out.print("------------------------------------------\n");

    */
    }
}


class Account{
    /*private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated;

    public Account(){dateCreated=new java.util.Date();}
    public Account( int newId,double newBalance){ id=newId;balance=newBalance; dateCreated=new Date();}


    public int getId(){return id;}
    public double getBalance(){return balance;}
    public double getAnnualInterestRate(){return annualInterestRate;}
    Date getDateCreated(){return dateCreated;}

    public void setId(int newId){ id=newId;}
    public void setBalance(double newBalance){balance=newBalance;}
    public void setAnnualInterestRate(double newAnnualInterestRate){annualInterestRate=newAnnualInterestRate;}

    public double getMonthlyInterest(){return balance*getAnnualInterestRate()/1200;}
    public void withdraw(double amount){ balance-=amount;}
    public void deposit(double amount){ balance+=amount;}

*/

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
        double monthlyInterest=(balance*getAnnualInterestRate()/1200); //Calculate monthly Interest and return

        return monthlyInterest ;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance-=amount;
    }

    public void deposit(double amount) {
        balance+=amount;
    }

}
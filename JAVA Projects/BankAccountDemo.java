abstract class BankAccount{
    private double balance;
    private int numOfDeposits;
    private int getNumOfWithdrawals;
    private double interestRate_Yearly;

    BankAccount(double balance, double interestRate_Yearly){
        this.balance=balance;
        this.interestRate_Yearly=interestRate_Yearly;
    }

     void balance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount<0){
            System.out.println("Amount must be greater than 0");
        }
        else{
        balance+=amount;
        numOfDeposits++;
        }
    }

    public void withdraw(double amount) {
        if(amount>balance){
            System.out.println("ERROR: Transaction declined!! This transaction will cause overdraft or zero balance\u2028");
        }
        else{
        balance-=amount;
        getNumOfWithdrawals++;
        }
    }

    private void CalcInterest(){
        double monthInterestRate=(interestRate_Yearly/12);
        double monthInterest=(balance*monthInterestRate)/100;
         balance+=monthInterest;
    }

    public void monthlyProcess(){
        CalcInterest();
        numOfDeposits=0;
        getNumOfWithdrawals=0;
    }

    int getNumOfDeposits() {
        return numOfDeposits;
    }

    int getGetNumOfWithdrawals() {
        return getNumOfWithdrawals;
    }

    double getBalance() {
        return balance;
    }

}

class Savingsaccount extends BankAccount{

    private boolean status;

    Savingsaccount(double balance, double interestRate_Yearly) {
        super(balance, interestRate_Yearly);
        if(balance<=25)
            status=false;
        if(balance>25)
            status=true;
    }

    public void withdraw(double amount){

        if(!status){
            System.out.println("Account is INACTIVE");
        }

        if(status){
            super.withdraw(amount);
            if(getGetNumOfWithdrawals()>4 && getBalance()>25 ){
                System.out.println("You have exceeded monthly limit of withdrawals. Fee of $1 charged\n");
                super.balance(getBalance()-1);
            }
        }

        if(getBalance()<=25 ){
            System.out.println("Your balance is less than minimum balance. Your account is now INACTIVE\n" +
                    "You have exceeded monthly limit of withdrawals. Fee of $1 charged\n");
            super.balance(getBalance()-1);
        }
    }

    public void deposit(double amount) {
        if ((getBalance()+amount) > 25 && getNumOfDeposits()>=1) {
            status = true;
            System.out.println("Your account is now ACTIVE");
        }
        if (status)
            super.deposit(amount);


        else
            System.out.println("Not Active");
    }
    public void monthlyProcess(){
        super.monthlyProcess();
        System.out.println("Balance after monthly process: $"+super.getBalance());
    }
}


public class BankAccountDemo {
    public static void main(String [] args){
        java.util.Scanner input=new java.util.Scanner(System.in);

        System.out.print("Enter beginning balance: $");
        double balance=input.nextDouble();
        System.out.print("Enter Annual interest rate(whole number): %");
        int interest=input.nextInt();
        while(balance<0 || interest<0){
            System.out.print("Must be bigger than 0.\nTry again: $");
            if(balance<0)
                balance=input.nextDouble();
            else
                interest=input.nextInt();
        }
        Savingsaccount savingsaccount=new Savingsaccount(balance,interest);

        String choice;
        double amount;
        do{
            System.out.println("Enter \"D\" to Deposit\n" +
                    "Enter \"W\" to Withdraw\n"+
                    "Enter \"B\" for Balance\n"+
                    "Enter \"M\" for MonthlyReport\n"+
                    "Enter \"E\" to EXIT\n");
                    choice=input.next();

                    while(choice.length()>1)
                    {
                        System.out.print("Invalid choice.\nTry again: ");
                        choice = input.next();
                    }

                    if(choice.equalsIgnoreCase("D")){
                        System.out.print("Enter the amount to Deposit: $");
                        amount=input.nextDouble();
                        while(amount<0){
                            System.out.print("Must be positive number.\nTry again:  $");
                            amount=input.nextDouble();
                        }
                        savingsaccount.deposit(amount);
                    }
                    if(choice.equalsIgnoreCase("W")){
                        System.out.print("Enter the amount to Withdraw: $");
                        amount=input.nextDouble();
                        while(amount<0){
                            System.out.print("Must be positive number.\nTry again:  $");
                            amount=input.nextDouble();
                        }
                        savingsaccount.withdraw(amount);
                    }
                    if(choice.equalsIgnoreCase("B")){

                        System.out.println("Your balance is:  $"+savingsaccount.getBalance());
                    }
                    if(choice.equalsIgnoreCase("M")){
                        savingsaccount.monthlyProcess();
                    }
        }while(!choice.equalsIgnoreCase("E"));

        System.out.println("Balance: $"+savingsaccount.getBalance());
        System.out.println("Thank you. Bye");


    }
}

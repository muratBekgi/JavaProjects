import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Account{
    private static DecimalFormat df = new DecimalFormat("0.00");
    private int AccountNumber;
    private double balance;
    
    Account( int AccountNumber, double balance){
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }
    public void credit(double amount){
        this.balance=this.balance+amount;
    }
    public void debit(double amount){
        if(amount>this.balance)
            System.out.println("Amount withdrawn exceeds the current balance!");
        else
        this.balance=this.balance-amount;
    }
    public void print(){
        System.out.println("AccountNumber: "+this.AccountNumber+"\nBalance: $"+df.format(this.balance));

    }
     public static void main(String []args){
       
       int accountNum=122456543;
       double balance=330;
       Account account=new Account(accountNum,balance);
       //withdraws money from an account
       double debit=200;
       //adds money into an account
       double credit=120;
       account.debit(debit);
       account.credit(credit);
       account.print();
       
       
     }
}
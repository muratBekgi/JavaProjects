import java.util.*;

public class LotteryGame {
    public static void main(String [] args){

        Scanner input=new Scanner(System.in);

        int randomNumber=(int)(Math.random()*100);
       //System.out.print(randomNumber);

        int randomFirstDigit=randomNumber/10;
        int randomSecondDigit=randomNumber%10;


        System.out.print("Enter two digits number (ex, 12): ");
        int userNumber=input.nextInt();

        int userFirstDigit=userNumber/10;
        int userSecondDigit=userNumber%10;


        while(userNumber<10 || userNumber>99)
        {
            System.out.print("Please enter only TWO digits number.\nTry again:\t");
            userNumber=input.nextInt();
        }

        if(randomNumber==userNumber)
        {
            System.out.print("You won $10000");
        }
        else if (userSecondDigit==randomFirstDigit || randomSecondDigit==userFirstDigit)
        {
            System.out.print("You won $3000");
        }
        else if((randomFirstDigit==userFirstDigit || randomFirstDigit==userSecondDigit)
                || (randomSecondDigit==userFirstDigit || randomSecondDigit==userSecondDigit))
        {
            System.out.print("You won $1000");
        }

        else
            System.out.print("You didn't win anything...Sorry-__-");


    }
}
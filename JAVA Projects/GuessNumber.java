import java.util.*;
public class GuessNumber {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        int number1=(int)(Math.random()*10);
        System.out.print(number1+"\n");

        System.out.print("Enter a guess: ");
        int guess=input.nextInt();

        while(guess!=number1)
        {
            if(guess>number1)
            {
                System.out.print("Your guess is too high.\nTry again: ");
                guess=input.nextInt();
            }
            else if(guess<number1)
            {
                System.out.print("Your guess is too low.\nTry again: ");
                guess=input.nextInt();
            }

        }

        System.out.print("That's correct. Your guess " +guess+" mathes with "+number1
                +" target number ");


    }
}

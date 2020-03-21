import java.util.*;

public class GenerateNumber{
   public static void main(String[] args){
   
   Scanner input=new Scanner(System.in);
   
   int x;
   x=(int)(Math.random()*101);
   
   System.out.print("Enter your guessed number: ");
   int guessedNumber=input.nextInt();
   
   System.out.print("Target Number is: "+x+"\n");
   System.out.print("Your guess number is: "+guessedNumber);
   System.out.println();
   
   if(guessedNumber>x)
   {
   System.out.print("Therefore>>>Your guess number is higher");
   }
   else if (guessedNumber<x)
   {
   System.out.print("Therefore>>>Your guess is lower");
   }
   else if(guessedNumber==x)
   {
   System.out.print("Therefore>>>Your guessed number is correct");
   }
   
   
   }


}
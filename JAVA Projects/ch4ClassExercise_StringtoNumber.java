import java.util.*;

public class ch4ClassExercise_StringtoNumber {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        char letter;

        System.out.print("Enter a letter: ");
        letter=input.nextLine().charAt(0);

        //System.out.print("The corresponding number is ");

      if((letter>=65 && letter<=67) || (letter>=97 && letter<=99))
      {
          System.out.print("The corresponding number is 2");
      }

      else if((letter>=68 && letter<=70) || (letter>=100 && letter<=102))
        {
            System.out.print("The corresponding number is 3");
        }

      else if((letter>=71 && letter<=73) || (letter>=103 && letter<=105))
      {
          System.out.print("The corresponding number is 4");
      }

      else if((letter>=74 && letter<=76) || (letter>=106 && letter<=108))
      {
          System.out.print("The corresponding number is 5");
      }

      else if((letter>=77 && letter<=79) || (letter>=109 && letter<=111))
      {
          System.out.print("The corresponding number is 6");
      }

      else if((letter>=80 && letter<=83) || (letter>=112 && letter<=115))
      {
          System.out.print("The corresponding number is 7");
      }

      else if((letter>=84 && letter<=86) || (letter>=116 && letter<=118))
      {
          System.out.print("The corresponding number is 8");
      }

      else if((letter>=87 && letter<=90) || (letter>=119 && letter<=122))
      {
          System.out.print("The corresponding number is 9");
      }

        else
            System.out.print(letter+" is an invalid input");




    }
}

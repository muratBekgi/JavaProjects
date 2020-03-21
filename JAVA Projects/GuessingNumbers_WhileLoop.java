import java.util.*;

public class GuessingNumbers_WhileLoop {
    public static void main(String []  args){

        Scanner input=new Scanner(System.in);

        int number=(int)(Math.random()*101);

        System.out.println(number);

        System.out.print("Guess a magic number betwenn 0 and 100");

        int answer= 0xffffffff;
        while(answer!=number){

            System.out.print("\nEnter your guess\t");
            answer=input.nextInt();

            if(answer==number)
                System.out.print("yes the number is "+answer);
            else if (answer>number)
                System.out.print("Your guess is too high");
            else
                System.out.print("Your guess is too low");
        }

    }


}

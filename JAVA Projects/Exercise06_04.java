import java.util.*;

public class Exercise06_04 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number=input.nextInt();                 //Accept Number
        reverse(number);
        System.out.println();


    }

    public static void reverse(int number)
    {

       while(number>0)
       {
           System.out.print(number%10);     //gets the last digit of numbers entered
           number/=10;                      // divides number by 10 to get the second num from right to left
       }                                    // and renews number variable
    }                                       //this only works in an int

}
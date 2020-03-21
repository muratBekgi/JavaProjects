
/*
Write a while loop that prints 1 to 5
Write a while loop that prints 5 to 1
Write a while loop that prints out summation of 1 + 2 + 3 + 4 + 5
 */

import java.util.*;

public class Loop1_To_5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("\n-----\n");
        int number=1;
        while(number<=5){

            System.out.print(number);
            number++;
        }

        System.out.print("\n-----\n");
        int number1=5;

        while(number1>=1)
        {
            System.out.print(number1);
            number1--;
        }
        System.out.print("\n-----\n");
        int number2=1;
        int sumOfNumber2=0;

        while(number2<=5)
        {
            sumOfNumber2+=number2;
            number2++;
        }
        System.out.print(sumOfNumber2);
        System.out.print("\n-----\n");







    }
}


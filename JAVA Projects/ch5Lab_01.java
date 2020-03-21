import java.util.Scanner;

public class ch5Lab_01 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter your second integer: ");
        int number2 = input.nextInt();

        int gcd=1;
        int k=2 ;     // possible gcd

        while(k<=number1 && k<=number2)
        {
            if(number1%k==0 && number2%k==0)
                gcd=k;
                 k++;
        }

        System.out.print("GCD for "+number1+" and "+number2+" is: "+gcd);

            /*

            while(number1!=number2)
            {
            if(number1>number2)
            number1-=number2;
            else
            number2-=number1;
            }


            System.out.print("GCD is: "+number1);

             */

    }
}

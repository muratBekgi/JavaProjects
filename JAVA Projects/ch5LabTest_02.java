import java.util.*;

public class ch5LabTest_02 {
    public static void main(String [ ]args) {
        Scanner input = new Scanner(System.in);

       /* System.out.print("Enter the number of lines: ");
        int numberOfLines=input.nextInt();

        for(int row =1; row<=numberOfLines; row++) {

            for(int column=1; column<=numberOfLines-row; column++)
                System.out.print("  ");

            for(int num=row; num>=1;num--)                      //left-side starts on first-line
               System.out.print((num>=10 )?" "+num:" "+num);

            for(int num=2; num<=row;num++)                     //right-side starts on second-line
                System.out.print((num>=10)?" "+num:" "+num);


            System.out.println();
        */

       System.out.print("Enter 1st number: ");
       int firstNumber=input.nextInt();
       System.out.print("Enter 2nd number: ");
       int secondNumber=input.nextInt();

       gcd(firstNumber,secondNumber);
    }
    public static int gcd(int num1, int num2)
        {
            int gcd=1;
            int k=2;
            while(k<=num1 && k<=num2)
            {
                if(num1%k==0 && num2%k==0)
                    gcd=k;
                k++;
            }

            System.out.print("GCD for "+num1+" and "+num2+ " is:"+gcd);
            return gcd;
        }

}
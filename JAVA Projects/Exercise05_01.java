import java.util.*;

public class Exercise05_01 {
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);

        double positiveNum=0, negativeNum=0, count=0,sum=0;

        System.out.print("Enter an integer(the input ends if it's 0):  ");
        int data=input.nextInt();

        if(data==0)
        {
            System.out.print("No numbers are entered except 0");
            System.exit(1);
        }


        while(data!=0)
        {
            if(data>0)
                positiveNum++;
            else
                negativeNum++;

            sum+=data;
            count++;

            System.out.print("Enter an integer(the input ends if it's 0):  ");
            data=input.nextInt();

        }


        System.out.print("\nThe number of positive is: " + positiveNum);
        System.out.print("\nThe number of negative is:  " + negativeNum);
        System.out.print("\nThe total is:  " + sum);
        System.out.print("\nThe average is:  " +(sum/count));

    }
}

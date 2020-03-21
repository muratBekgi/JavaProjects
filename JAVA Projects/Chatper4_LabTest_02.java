import java.util.*;

public class Chatper4_LabTest_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0-15): ");
        int value = input.nextInt();

        if(value>=10 && value<=15){

            System.out.print("The hex value is ");
            if (value==10)
            {
                System.out.print("A");
            }
            else if (value==11)
            {
                System.out.print("B");
            }
            else if (value ==12)
            {
                System.out.print("C");
            }
            else if (value==13)
            {
                System.out.print("D");
            }
            else if (value==14)
            {
                System.out.print("E");
            }
            else  if  (value==15)
            {
                System.out.print("F");
            }
        }
        else if(value>=0 && value<=9)
        {
            System.out.print("The hex value is "+value);
        }

        else
            System.out.print(value+" is an invalid input");


    }
}


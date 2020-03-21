import java.util.Scanner;

public class MaxOf2Numbers {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter 1st integer: ");
        int firstInt=input.nextInt();
        System.out.print("Enter 2nd integer: ");
        int secondInt=input.nextInt();

        System.out.print("Enter 1st double: ");
        double firstDouble=input.nextDouble();
        System.out.print("Enter 2nd double: ");
        double secondDouble=input.nextDouble();

        System.out.print("Enter 1st double: ");
        double double1=input.nextDouble();
        System.out.print("Enter 2nd double: ");
        double double2=input.nextDouble();
        System.out.print("Enter 3rd double: ");
        double double3=input.nextDouble();

        System.out.println("The max of "+firstInt+" and "+secondInt+" is "
                +maxInteger(firstInt,secondInt));

        System.out.println("The max of "+firstDouble+" and "+secondDouble+" is "
                +maxDouble(firstDouble,secondDouble));

        System.out.println("The max of "+double1+","+double2+" and "+double3+" is "
                +max3Numbers(double1,double2,double3));
    }

    public static int maxInteger(int num1, int num2)
    {
        if(num1>num2)
            return num1;
        else
            return num2;
    }
    public static double maxDouble(double num1, double num2)
    {
        if(num1>num2)
            return num1;
        else
            return num2;
    }
    public static double max3Numbers(double num1, double num2, double num3)
    {
        if(maxDouble(num1,num2)>num3)
            return maxDouble(num1, num2);
        else
            return num3;
    }


}

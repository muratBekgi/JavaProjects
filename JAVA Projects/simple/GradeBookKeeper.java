import java.util.Arrays;
import java.util.Scanner;

public class GradeBookKeeper
{
    public static void main(String[] arg)
    {
        Scanner scan= new Scanner(System.in);

        int[] items;
        double sum=0;
        int numItems,largest,smallest;

        System.out.print("Enter the number of students:  ");
        numItems=scan.nextInt();
        items=new int [numItems];
        largest=smallest=items[0];

        for(int i=0;i<items.length;i++)
        {
            System.out.print("Enter the grade for student "+(i+1)+": ");
            items[i] = scan.nextInt();
            sum+=items[i];

        }
        for (int i = 0; i < items.length; i++) {
            Arrays.sort(items);
            largest=items[items.length-1];
            smallest=items[0];
        }


        System.out.printf("The average is "+"%.2f\n",sum/items.length);
        System.out.println("The minimum is: "+smallest);
        System.out.println("The maximum is: "+largest);
        scan.close();
    }
}

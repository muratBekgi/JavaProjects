import java.util.*;

public class Exercise05_03 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int kilograms;
        double pounds=0;

        System.out.print("Kilograms   Pounds");
        for(kilograms=1; kilograms<200; kilograms+=2)
        {
            pounds=kilograms*2.2;
            System.out.println();
            System.out.printf(kilograms+"\t\t\t%.1f",pounds);

        }

    }
}

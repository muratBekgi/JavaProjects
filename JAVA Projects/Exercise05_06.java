//(Conversion from miles to kilometers) Write a program that displays
// the follow- ing two tables sideby side 1 mile=1.609 km

import java.util.*;

public class Exercise05_06 {
    public static void main(String[] args){
        Scanner my=new Scanner(System.in);

        System.out.printf("%-10s %8s |   %-8s %10s%n",
                "Miles",
                "Kilometers",
                "Miles",
                "kilometers");

        int kilometers=20;
        for(int i=1; i<=10; i++)
        {
            System.out.printf("%-10d %8.3f   |   %-8d %10.3f%n",
                    i,
                    i*1.609,
                    kilometers,
                    kilometers/1.609);
            kilometers+=5;
        }


    }
}

/*
(Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array
using the following method header:
public static int[] eliminateDuplicates(int[] list)
Write a test program that reads in ten integers, invokes the method, and displays the result. Here is the sample
run of the program:
Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5
 */

import java.util.*;
public class ch7_Lab_02 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        int [] tenNumbers=new int[10];
        for(int i =0; i< tenNumbers.length; i++){
            tenNumbers[i]=input.nextInt();
        }

        printArray(eliminateDuplicates(tenNumbers));
    }
    public static int[] eliminateDuplicates(int [] list){       // do not forget {} ! in each if else statement
        int count=0;
        int [] tempList=new int [list.length];
        int count1=0;
        for(int i=0; i<list.length; i++){
            boolean unikNumbers=true;

            for(int j=0; j<list.length; j++) {
                if (tempList[j] == list[i]) {
                    unikNumbers = false;

                }
            }
            if(unikNumbers){
                tempList[count++]=list[i];

            }
        }
        int [] lessCount=new int [count];
        for(int k=0; k<count; k++){
            lessCount[k]=tempList[k];
            count1++;

        }
        System.out.println("The number of distinct number is "+count1);
        return lessCount;
    }

    public static void printArray(int [] array){

        System.out.print("The distinct number are: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}

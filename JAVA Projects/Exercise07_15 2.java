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
public class Exercise07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] result = eliminateDuplicates(numbers);

        System.out.println(
                "The number of distinct values is " + result.length);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");


    }


    public static int[] eliminateDuplicates(int[] numbers) {       // do not forget {} ! in each if else statement
        int count = 0;
        int[] tempList = new int[numbers.length];
        int count1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean unikNumbers = true;

            for (int j = 0; j < numbers.length; j++) {
                if (tempList[j] == numbers[i]) {
                    unikNumbers = false;

                }
            }
            if (unikNumbers) {
                tempList[count++] = numbers[i];

            }
        }
        int[] result = new int[count];
        for (int k = 0; k < count; k++) {
            result[k] = tempList[k];
            count1++;

        }

        return result;
    }
}
/*
import java.util.*;
public class Exercise08_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

double[][] matrix1=getMatric(1);
double[][] matrix2=getMatric(2);

double[][]matrix3=multiplyMatrix(matrix1,matrix2);

printMatrix(matrix1,matrix2,matrix3);
    }

public static double [] [] getMatric(int num){
        Scanner input=new Scanner(System.in);

    System.out.print("Enter matrix"+num+": ");

    double [] [] k=new double[3][3];
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++)
            k[i][j]=input.nextDouble();
    }
    return k;
}

    public static double [] [] multiplyMatrix(double[][] a, double[][] b) {
        Scanner input = new Scanner(System.in);

       double [] [] c=new double[3][3];

       for(int i=0; i<c.length; i++){
           for(int j=0; j<c[i].length;j++){
               for(int k=0; k<c.length;k++){
                   c[i][j]+=a[i][k]*b[k][j];
               }
           }
       }
       return c;

    }

    public static void print(double[] [] k, int i ){
        for(int j=0; j<k[i].length; j++){
            System.out.printf("%5.1f",k[i][j]);
        }
    }

    public static void printMatrix(double [][]k1,double[][]k2,double[][]k3){
        System.out.println("The matrices are added as follow");

        for(int i=0; i<3;i++){
            print(k1,i);
                    System.out.print((i==1?"  *" : "   "));
            print(k2,i);
            System.out.print((i==1?"  =" : "   "));
            print(k3,i);
            System.out.println();

        }
    }


}

 */
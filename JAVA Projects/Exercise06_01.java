/*(Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
 n = 1,2,...,and so on.Therefore,the first few numbers are 1,5,12,22,....
 Write a method with the following header that returns a pentagonal number:
 public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first
100 pentagonal numbers with 10 numbers on each line.
 */
import java.util.Scanner;
public class Exercise06_01 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        for(int i=1; i<101; i++) {
            System.out.printf("%6d",getPentagonalNumber(i));
            if (i%10 == 0)
                System.out.println();
         }
         }

    public static int getPentagonalNumber(int n){

        return (n*(3*n-1))/2;

    }
}


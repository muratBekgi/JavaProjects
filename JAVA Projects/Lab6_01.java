import java.util.Scanner;

public class Lab6_01 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        for (int i=1; i<101; i++)
        {
            System.out.printf("%6d",getPentagonalNumber(i));
            if(i%10==0)
                System.out.println();
        }
    }
    public static int getPentagonalNumber(int n){

        return (n*(3*n-1))/2;
    }
}

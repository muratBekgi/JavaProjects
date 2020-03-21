import java.util.Scanner;

public class Lab6_02 {
    public static void main(String [ ] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines=input.nextInt();
        displayPattern(lines);
    }
    public static void displayPattern(int n){

        /*
                    1   i=1; j=1;    k=2
                  2 1   i=2; j=2..1; k=1
               3  2 1   i=3; j=3..1; k=0
         */
        for(int i=1;i<=n;i++){
            for(int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for(int j=i; j>=1; j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}

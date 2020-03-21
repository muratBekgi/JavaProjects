import java.util.Scanner;

public class ChemCalculator {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("\nEnter number: ");
        double num=input.nextDouble();

        double answer;

        do{
            answer=Math.pow(10,(-1*num));
            System.out.print(answer);
            System.out.print("\nEnter number: ");
             num=input.nextDouble();
        }while(num!=(-1));
    }
}

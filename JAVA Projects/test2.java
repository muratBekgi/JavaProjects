
import java.util.Scanner;

public class test2 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);


        System.out.println("Enter a word: ");
        String w1=input.next();
        System.out.println("Enter another word: ");
        String w2=input.next();



        int counter=0;
        for(int i = 0; i < 4; i++)
        {
            if (w1.charAt(i) != w2.charAt(i))
            {
                counter++;
            }
        }

        System.out.println("Counter: "+counter);

        if(counter==1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

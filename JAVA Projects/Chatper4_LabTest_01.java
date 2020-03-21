import java.util.*;
public class Chatper4_LabTest_01 {
    public static void main(String [] args){

        Scanner input=new Scanner(System.in);

        char character;

        System.out.print("Enter the  character: ");
                character=input.next().charAt(0);

                System.out.print("The Unicode for the character "+character+" is "+(int)+character);

    }
}

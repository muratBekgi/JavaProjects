import java.util.*;

public class InputMismatchExceptionDemo {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        boolean continueInput=true;

        do {
            try {
                System.out.println("Enter an ineger: ");
                int integerNum = input.nextInt();

                System.out.println("The entered number is: " + integerNum);

                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                input.nextInt();
            }
        }while(continueInput);
    }
}

package UsingMultipleClasses;
import java.util.Scanner;

public class apples {
    public static void main(String [] args) {
        Scanner input=new Scanner(System.in);
        tuna tunaObject = new tuna();

        System.out.println("Enter number of first girlfriend here ");
        String temp=input.nextLine();

        tunaObject.setGirlNameName(temp);
        tunaObject.saying();



    }
}

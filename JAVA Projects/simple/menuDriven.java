import java.util.Scanner;

public class menuDriven
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        displayMenu(keyboard);

    } // end main

    private static void displayMenu(Scanner keyboard)
    {

        System.out.println("1. Convert inches to centimeters");
        System.out.println("2. Convert feet to meters");
        System.out.println("3. Convert miles to kilometers");
        System.out.println();

        System.out.println("Enter your selection");
        int menuSelection = keyboard.nextInt();
        while (menuSelection < 1 || menuSelection > 3)
        {
            System.out.println("Please enter 1, 2, or 3.");
            menuSelection = keyboard.nextInt();
        }
        switch(menuSelection)
        {
            case 1:
                inchesToCentimeters(keyboard);
                break;

            case 2:
                feetToMeters(keyboard);
                break;

            case 3:
                milesToKilometers(keyboard);
                break;
        }
        /* return menuSelection; */
    }

    private static void inchesToCentimeters(Scanner keyboard)
    {
        double inches, centimeters;
        System.out.print("Enter the number of inches: ");
        inches = keyboard.nextDouble();
        centimeters = inches * 2.54;
        System.out.println("That is equal to " + centimeters + " centimeters.");

    }

    private static void feetToMeters(Scanner keyboard)
    {
        double feet, meters;
        System.out.println("Enter the number of feet: ");
        feet = keyboard.nextDouble();
        meters = feet * 0.3048;
        System.out.println("That is equal to " + meters + " meters.");
    }

    private static void milesToKilometers(Scanner keyboard)
    {
        double miles, kilometers;
        System.out.println("Enter the number of miles: ");
        miles = keyboard.nextDouble();
        kilometers = miles * 1.609;
        System.out.println("That is equal to " + kilometers + " kilometers.");
    }
} // end class
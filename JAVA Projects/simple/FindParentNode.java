import java.util.*;

public class FindParentNode {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        Scanner num = new java.util.Scanner(System.in);
        getHour(num);
    }

    private static int getHour(Scanner scan) {
        int hour ;

        System.out.println("Enter the hour for the showtime (1-24):");
        scan.nextInt();
        while ((!scan.hasNextInt()) || ((hour = scan.nextInt()) < 1) || (hour > 24)) {
            System.out.println("Enter a valid number");
            scan.nextInt();
        }
        return hour;

    }
}
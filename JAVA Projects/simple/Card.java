import java.util.Scanner;

public class Card {

    public static void main(String[] args) {

        System.out.println("Enter the requested input");

        //Call Arrival Date Method
        getArrivalDate();

    }


    private static void getArrivalDate() {
        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        String again;
        do {
            System.out.print("month (1-12): ");
            int month = sc.nextInt();
            while(month>12){
                System.out.print("Month must be between 1-12.\nTry again:");
                month=sc.nextInt();
            }
            System.out.print("day (1-31):  ");
            int day = sc.nextInt();
            System.out.print("year: ");
            int year = sc.nextInt();

            setArrivalDate(month, day, year);
            System.out.println("\nDo you want to continue? (Y/N): ");
            again = sc.next();
        } while (again.equalsIgnoreCase("Y"));

    } //End getArrivalDate


    private static void setArrivalDate(int month, int day, int year) {


        System.out.print("\nArrival Date: ");
        switch (month) {
            case 1:
                System.out.println("January " + day + " " + year);
                break;

            case 2:
                System.out.println("Feb " + day + " " + year);
                break;

            case 3:
                System.out.println("March " + day + " " + year);
                break;

            case 4:
                System.out.println("April " + day + " " + year);
                break;

            case 5:
                System.out.println("May " + day + " " + year);
                break;

            case 6:
                System.out.println("June " + day + " " + year);
                break;

            case 7:
                System.out.println("July " + day + " " + year);
                break;

            case 8:
                System.out.println("August " + day + " " + year);
                break;

            case 9:
                System.out.println("September " + day + " " + year);
                break;

            case 10:
                System.out.println("October " + day + " " + year);
                break;

            case 11:
                System.out.println("November " + day + " " + year);
                break;

            case 12:
                System.out.println("December " + day + " " + year);

        }
    }


}



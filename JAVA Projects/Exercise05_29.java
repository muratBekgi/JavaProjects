import java.util.Scanner;

public class Exercise05_29 {
    static String inputMsg1="Enter a year: ";
    static String inputMsg2 = "Enter the first day of the year: ";
    static String paddingBeforeMonthName = "          ";  // space Padding before each month name
    static String monthHeader1="-----------------------------"; // Header1 before each Month
    static String monthHeader2=" Sun Mon Tue Wed Thu Fri Sat"; // Header1 before each Month
    static String paddingBeforeEmptyDayInMonth="    "; // Padding for days not in month e.g in the output given below for January first week sunday is not included hence this padding is printed
    static String paddingBeforeSingleDigitDayInMonth="   ";// Padding for single digit days in month e.g in the output given below for January first week Tuesday is
    // single digit day hence this padding is printed before printing 2
    static String paddingBeforeDoubleDigitDayInMonth="  ";// Padding for double digit days in month e.g in the output given below for January third week Sunday is
    // double digit day hence this padding is printed before printing 21
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        // Prompt the user to enter input
        System.out.print(inputMsg1);
        int year=input.nextInt(); //Accept Year

        System.out.print(inputMsg2);
        int firstDay=input.nextInt();  // Accept firstDay

        int startDay = firstDay;
        int numberOfDaysInMonth=0;


        //System.out.print(inputMsg1);
        //int year=input.nextInt();

       // System.out.print(inputMsg2);
        //int firstDay=input.nextInt();

        for(int month=1; month<=12; month++)
        {
            String monthNames="";
           // numberOfDaysInMonth=0;
            switch(month)
            {
                case 1: monthNames="January";    numberOfDaysInMonth=31; break;
                case 2: monthNames="February";
                if(year%4==0)                                    //leap year is = 29 if it is divisible by 4 modulo = 0
                    numberOfDaysInMonth=29;
                else
                    numberOfDaysInMonth=28;
                break;
                case 3:  monthNames="March";     numberOfDaysInMonth=31; break;
                case 4:  monthNames="April";     numberOfDaysInMonth=30; break;
                case 5:  monthNames="May";       numberOfDaysInMonth=31; break;
                case 6:  monthNames="June";      numberOfDaysInMonth=30; break;
                case 7:  monthNames="July";      numberOfDaysInMonth=31; break;
                case 8:  monthNames="August";    numberOfDaysInMonth=31; break;
                case 9:  monthNames="September"; numberOfDaysInMonth=30; break;
                case 10: monthNames="October";   numberOfDaysInMonth=31; break;
                case 11: monthNames="November";  numberOfDaysInMonth=30; break;
                case 12: monthNames="December";  numberOfDaysInMonth=31; break;
            }

            System.out.println(paddingBeforeMonthName+monthNames+" "+year);
            System.out.println(monthHeader1);
            System.out.println(monthHeader2);

            for(int i=1; i<=startDay;i++)
                System.out.print(paddingBeforeEmptyDayInMonth);          // 5 spaces b/c Days are 3 characters plus 2 spaces between each

            for(int a=1; a<=numberOfDaysInMonth;a++)
            {
                if(startDay%7==0 && startDay!=0)
                    System.out.println(paddingBeforeSingleDigitDayInMonth);
                System.out.print(paddingBeforeDoubleDigitDayInMonth+ a);      //%3d b/c days has 3 character(Sun) plus 2 spaces between each
                startDay+=1;
            }
            startDay%=7;
            System.out.print("\n\n");               // spcaes between each month calendar

        }


    }
}




















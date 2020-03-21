import java.util.*;

public class Exercise3_21 {
    static String inputMsg1="Enter year: (e.g., 2008): ";
    static String inputMsg2 = "Enter month: 1-12: ";
    static String inputMsg3 = "Enter the day of the month: 1-31: ";

    static String Saturday_Msg ="Day of the week is Saturday";
    static String Sunday_Msg = "Day of the week is Sunday";
    static String Monday_Msg = "Day of the week is Monday";
    static String Tuesday_Msg = "Day of the week is Tuesday";
    static String Wednesday_Msg = "Day of the week is Wednesday";
    static String Thursday_Msg = "Day of the week is Thursday";
    static String Friday_Msg = "Day of the week is Friday";

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print(inputMsg1);
        int year = input.nextInt();

        System.out.print(inputMsg2);
        int month= input.nextInt();

        System.out.print(inputMsg3);
        int dayOfMonth= input.nextInt();



       // int dayOfWeek; //Calculate Day of the week





      //  int month, year, dayOfMonth, dayofWeek ;


      /* // System.out.println("-------------------------------------");
        System.out.print(inputMsg1);               // int=year called
        year=input.nextInt();
        System.out.print(inputMsg2);                    //int=month integer called
        month=input.nextInt();
        System.out.print(inputMsg3);      // int=dayOfMonth varible called
        dayOfMonth=input.nextInt();
       // System.out.println("-------------------------------------");*/



        // January and February are counted as 13 and 14 in the formula, so you need to convert the user input
        // 1 to 13 and 2 to 14 for the month and CHANGE the YEAR to the previous year
        if(month==1) {
            month=13;
            year-=1; }

        if(month==2) {
            month=14;
            year-=1; }


        // formula is given in the book
        int dayOfWeek=(dayOfMonth+(26*(month+1))/10+(year%100)+(year%100)/4 +(year/100)/4 +5*(year/100))%7;

        System.out.println("year is " + year);
        System.out.println("month is " + month);
        System.out.println("day is " + dayOfMonth);
        System.out.println("h is " +dayOfWeek);

       // System.out.print("Day of the week is  \" ");
        //display the result
        switch(dayOfWeek)
        {
            case 0: System.out.println(Saturday_Msg);  break;
            case 1: System.out.println(Sunday_Msg);    break;
            case 2: System.out.println(Monday_Msg);    break;
            case 3: System.out.println(Tuesday_Msg);   break;
            case 4: System.out.println(Wednesday_Msg); break;
            case 5: System.out.println(Thursday_Msg);  break;
            case 6: System.out.println(Friday_Msg);
        }
    }
}

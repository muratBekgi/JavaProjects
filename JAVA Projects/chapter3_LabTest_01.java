import java.util.*;

public class chapter3_LabTest_01 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int year, month;

        System.out.print("Enter the month: 1-12: ");
        month=input.nextInt();
        System.out.print("Enter the year: (e.g., 2012): ");
        year=input.nextInt();

        switch(month)
        {
            case 1:  System.out.print("January "+year+" had 31 days");     break;
            case 2:
                {
                if(year%4==0)
                {
                     System.out.print("February "+year+" had 29 days");    break;
                }
                else
                     System.out.print("February "+year+" had 28 days");    break;
                }
            case 3:  System.out.print("March "+year+" had 31 days");       break;
            case 4:  System.out.print("April "+year+" had 30 days");       break;
            case 5:  System.out.print("May "+year+" had 31 days");         break;
            case 6:  System.out.print("June "+year+" had 30 days");        break;
            case 7:  System.out.print("July "+year+" had 31 days");        break;
            case 8:  System.out.print("August "+year+" had 31 days");      break;
            case 9:  System.out.print("September "+year+" had 30 days");   break;
            case 10: System.out.print("October "+year+" had 31 days");     break;
            case 11: System.out.print("November "+year+" had 30 days");    break;
            case 12: System.out.print("December "+year+" had 31 days");    break;
            default: System.out.print("Invalid Number, please try again");
        }
    }
}

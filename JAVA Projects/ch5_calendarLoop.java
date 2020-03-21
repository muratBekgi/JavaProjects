import java.util.Scanner;

public class ch5_calendarLoop {
    public static void main(String [] args){
        Scanner me=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the year: ");
        int year=me.nextInt();
        System.out.print("Enter the first day(ex: \"0\" for \"Sunday\"): ");
        int firstDay=me.nextInt();

        for(int month=1; month<12; month++){

            int daysOf_months=0;
            String namesOf_months="";

            switch(month){
                case 1: namesOf_months="January"; daysOf_months=31; break;
                case 2: namesOf_months="February";
                        if(daysOf_months%4==0)
                            daysOf_months=29;
                        else
                            daysOf_months=28;   break;
                case 3: namesOf_months="March"; daysOf_months=31; break;
                case 4: namesOf_months="April"; daysOf_months=30; break;
                case 5: namesOf_months="May";   daysOf_months=31; break;
                case 6: namesOf_months="June";  daysOf_months=30; break;
                case 7: namesOf_months="July";  daysOf_months=31; break;
                case 8: namesOf_months="August";daysOf_months=31; break;
                case 9: namesOf_months="September"; daysOf_months=30; break;
                case 10: namesOf_months="October"; daysOf_months=31; break;
                case 11: namesOf_months="November"; daysOf_months=30; break;
                case 12: namesOf_months="December"; daysOf_months=31; break;
            }

            System.out.println("\n         "+namesOf_months+" "+year);
            System.out.println("---------------------------------");
            System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

            for(int i=1; i<=firstDay; i++)
                System.out.print("     ");
            for(int x=1; x<=daysOf_months; x++)
            {
                if(firstDay%7==0 && firstDay!=0)
                    System.out.println();
                System.out.printf("%3d  ", x);
                firstDay+=+1;
            }
            firstDay%=7;
            System.out.print("\n\n\n");
        }
    }
}

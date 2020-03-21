import java.util.Scanner;

public class Exercise3_4 {
    static String January_Msg="Month is January";
    static String February_Msg="Month is February";
    static String March_Msg="Month is March";
    static String April_Msg="Month is April";
    static String May_Msg="Month is May";
    static String June_Msg="Month is June";
    static String July_Msg="Month is July";
    static String August_Msg="Month is August";
    static String September_Msg="Month is September";
    static String October_Msg="Month is October";
    static String November_Msg="Month is November";
    static String December_Msg="Month is December";




        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
           // System.out.print(inputMsg);

        int randomNumber;

        randomNumber=1+(int)(Math.random()*12);
        System.out.println(randomNumber);

        switch(randomNumber) {
            case 1:
                System.out.println(January_Msg);
                break;
            case 2:
                System.out.println(February_Msg);
                break;
            case 3:
                System.out.println(March_Msg);
                break;
            case 4:
                System.out.println(April_Msg);
                break;
            case 5:
                System.out.println(May_Msg);
                break;
            case 6:
                System.out.println(June_Msg);
                break;
            case 7:
                System.out.println(July_Msg);
                break;
            case 8:
                System.out.println(August_Msg);
                break;
            case 9:
                System.out.println(September_Msg);
                break;
            case 10:
                System.out.println(October_Msg);
                break;
            case 11:
                System.out.println(November_Msg);
                break;
            case 12:
                System.out.println(December_Msg);
                break;
            default:
                System.out.println("Invalid Number. Enter between 1-12");
        }



            /*     THIS CODE ALSO WORKS BUT I USED if & else instead of switch


       int number;

       number=1+(int)(Math.random()*12);

       System.out.println(number);

       if(number==1)
       {
           System.out.println("January");
       }

       else if(number==2)
       {
           System.out.println("February");
       }

       else if (number==3)
       {
           System.out.println("March");
       }

       else if(number==4)
       {
           System.out.println("April");
       }

       else if (number==5)
       {
           System.out.println("May");
       }

        else if(number==6)
        {
            System.out.println("June");
        }

        else if(number==7)
        {
            System.out.println("July");
        }

        else if (number==8)
        {
            System.out.println("August");
        }

        else if(number==9)
        {
            System.out.println("September");
        }

        else if (number==10)
        {
            System.out.println("October");
        }

        else if(number==11)

       {
           System.out.println("November");
       }

       else if (number==12)
       {
           System.out.println("December");
       }



*/
        }
    }



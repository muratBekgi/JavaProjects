public class MonthsArray {
    public static void main(String [ ]args){
        java.util.Scanner input=new java.util.Scanner(System.in);

        String [] monthNames={"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November","December"  };
        System.out.println("Enter month number(1-12): ");
        int monthNumber=input.nextInt();
        System.out.println("The month is: "+monthNames[monthNumber-1]); //-1 b/c array starts from 0



        int x = 30;
        int[] numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);
        System.out.println("The size of numbers is " + numbers.length);


        int list[] = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < list.length; i++)
            list[i] = list[i - 1];
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}

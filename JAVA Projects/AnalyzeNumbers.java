public class AnalyzeNumbers {
    public static void main(String [] args){
        java.util.Scanner input=new java.util.Scanner(System.in);

        System.out.println("Enter the  number of items: ");
        int entered=input.nextInt();
        double [] enteredNUmber=new double[entered];

        double average=0,
                greaterAverage=0;

        System.out.println("Enter the numbers: ");
        for(int i=0; i<entered; i++){
            enteredNUmber[i]=input.nextDouble();
            average+=(enteredNUmber[i]/entered);
        }
        System.out.println("Average is: "+average);

        for(int i=0; i<entered; i++){
            if(enteredNUmber[i]>average)
                greaterAverage++;
        }
        System.out.println("Greater number entered above average is: "+greaterAverage);


    }
}

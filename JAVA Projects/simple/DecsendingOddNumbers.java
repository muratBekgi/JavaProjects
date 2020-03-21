import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DecsendingOddNumbers {

    /*public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an an odd number: ");
        int number = input.nextInt();
        while(number%2==0){
            System.out.print("Number must be odd number:" +
                    "(Ex:1, 3,5)\nTry again: ");
            number=input.nextInt();
        }

        for (int i = number; i >= 0; i--) {
            if(number%2!=0){
                System.out.println(number);}
            number-=1;
        }
    }*/

        private static int readdata()throws
                FileNotFoundException {

            Scanner input=new Scanner(new File(
                    "/Users/MUratBekgi/Desktop/ClassCodes_2/stack overflow/src/setsofdata.txt"));


            int countSets=0;
            String line="";
            while(input.hasNextLine()){
                 line=input.nextLine();
                countSets++;

            }
            System.out.println("Sets of data read are "+countSets);
            return countSets;

        }


        public static void main(String[]args)throws FileNotFoundException{
            readdata();
        }


}

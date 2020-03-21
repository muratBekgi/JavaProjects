
import java.io.*;
import java.util.*;

public class Lab08{
    @SuppressWarnings("unchecked")
    private static Map<String, Integer>[] boys = new HashMap[10];
    @SuppressWarnings("unchecked")
    private static Map<String, Integer>[] girls = new HashMap[10];

    public  static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String answer;
        int num, numRank;


        // Get user input and continue until done
        do {
            System.out.print("Enter a year (2008-2017): ");
            int year = input.nextInt();input.nextLine();
            System.out.print("Boy or girl? ");
            String sex = input.nextLine().toLowerCase();
            System.out.print("Enter a name: ");
            String name = input.nextLine();

            readNames(year);    // method to read the info from the files and add to our Map array

            switch (sex) {
                // display the output based on the sex (boy or girl)
                case "boy":
                    num=year-2008;
                    numRank=boys[num].get(name);
                    System.out.printf("The Boy named %s is ranked #%d in %d\n",name,numRank,year);
                    break;

                case "girl":
                    num=year-2008;
                    numRank=girls[num].get(name);
                    System.out.printf("The Boy named %s is ranked #%d in %d\n",name,numRank,year);
                    break;

                default:
                    System.out.println("Sex must be girl or boy");
                    break;
            }

            System.out.print("Do you want check another name (yes or no)?");
            answer = input.nextLine().toLowerCase();
        } while (answer.equals("yes"));

    } // end main


    //read information from each file and add to appropriate Map array
    public static void readNames(int year) throws IOException {
        File infile;
        for(int i=0;i<10;++i) {
            boys[i] = new HashMap<>();
            girls[i] = new HashMap<>();

        }

        for(int i=0;i<=9;++i) {
            // construct the file name
            String filename="/Users/MUratBekgi/Desktop/babynameranking"+year+".txt";        // construct the file name ;
            infile = new File(filename);

            Scanner in = new Scanner(infile);
            while(in.hasNext()) {
                // read info from the file and add to Map arrays
                int numRank=in.nextInt();
                String boy_sName=in.next();
                in.next();
                String girl_sName=in.next();
                in.next();
                boys[i].put(boy_sName,numRank);
                girls[i].put(girl_sName,numRank);
            } // end while
            in.close();
        } // end for loop
    } // end readNames()
} // end Lab08





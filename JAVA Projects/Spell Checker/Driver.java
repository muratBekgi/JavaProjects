import java.io.*;
public class Driver {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        SpellCheckInterface check = new SpellChecker();
        check.loadDictionary("/Users/MUratBekgi/Desktop/dictionary.txt");

        if(check.checkDocument("/Users/MUratBekgi/Desktop/test.txt"))
            System.out.println("No misspelled words found");

        if(check.checkDocument("/Users/MUratBekgi/Desktop/short.txt"))
            System.out.println("No misspelled words found");

    }

}



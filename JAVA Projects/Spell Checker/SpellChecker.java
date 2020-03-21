import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;


public class SpellChecker implements SpellCheckInterface {

    List<String> dict;
    LinkedList<Word> misspelled;

    public SpellChecker() {
        dict = new LinkedList<>();
        misspelled = new LinkedList<Word>();
    }

    /**
     * Loads the dictionary contained in the specified file
     *
     * @param fileName The name of the dictionary file to be loaded
     * @return true If the file was successfully loaded, false
     *          if the file could not be loaded or was invalid
     * @throws IOException if filename does not exist
     */
    @Override
    public boolean loadDictionary(String fileName) throws  IOException
    {
        // Left as exercise
        try {
            //reads dictionary as a list
            dict = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }

        catch (IOException e) {
            return false;
        }
        return true;
    }

    /**
     * Check the document for misspelled words
     *
     * @return A list of misspelled words and
     *         the line numbers where they occur.
     * @throws @throws IOException if filename does not exist
     */
    @Override
    public boolean checkDocument(String fileName) throws IOException {
        misspelled = new LinkedList<>();  // Initialize for each file
        int lineNumber = 0;
        try {
            File infile = new File(fileName);
            System.out.println("\n\nFile Name:"+ fileName);
            try ( Scanner in = new Scanner(infile); ) {
                /*in.useDelimiter("[^A-Za-z]+");  // split input by words
                while (in.hasNext()){
                    String myWord = in.next().toLowerCase();

                    lineNumber++;*/
                while (in.hasNextLine()) {

                    String line = in.nextLine().toLowerCase();
                    lineNumber++;
                    String[] tokens = line.split("[ \\P{Alpha}]+");
                    for (int i = 0; i < tokens.length; ++i) {
                        if (tokens[i].length() == 0) // ignore blank lines
                            continue;
                        if (!dict.contains(tokens[i])) {
                            Word word = new Word(tokens[i], lineNumber);

                            // Left as exercise
                            // if dictionary does not contain myWord:
                            // myWord is misspelled
                            // if misspelled list contains myWord, update the lineNumber
                            // otherwise add a new Word to misspelled list

                            // Word newWord = new Word(myWord, lineNumber);
                            if (!dict.contains(word)) {
                                //System.out.print(myWord);
                                if (misspelled.contains(word)) {
                                    misspelled.get(misspelled.indexOf(word)).addLine(lineNumber);
                                } else
                                    misspelled.add(word);
                            }


                        }

                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
            return false;
        }
            // sort misspelled list

            Collections.sort(misspelled);

            if(misspelled.size()==0)
                return true;
            else {
                System.out.println("Misspelled words are");
                for(Object w : misspelled)
                    System.out.println(w);
                return false;
            }

        }
    }
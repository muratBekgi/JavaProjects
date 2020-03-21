import java.util.Scanner;
import java.io.File;

public class DirectorySize {
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter directory or a file: ");
        String directory=input.nextLine();

        //Display the size
        System.out.println(getSize(new File(directory))+" bytes");
    }

    public static long getSize(File file){
        long size=0;

        if(file.isDirectory()){
            File[] files=file.listFiles();      //All files and subdirections
            for(int i=0; files!=null && i<files.length; i++){
                size+=getSize(files[i]);        //recursive call
            }
        }
        else{
            size+=file.length();
        }
        return size;
    }
}

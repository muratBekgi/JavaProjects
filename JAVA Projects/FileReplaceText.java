import java.io.IOException;
import java.io.*;
import java.util.*;

//java ReplaceText "Prog1.java" "Prog2.java"  "StringBuilder" "StringBuffer"
public class FileReplaceText {
    public static void main(String [] args)throws IOException {

        if(args.length!=4){
            System.out.println("Error not enough argumetns");
            System.exit(0);
        }
        File inFile=new File(args[0]);
        File outFile=new File(args[1]);

        try (
            Scanner input = new Scanner(inFile);
            PrintWriter output = new PrintWriter(outFile);
            )
        {
            while(input.hasNext())
            {
                String s1=input.nextLine();
                String s2=s1.replaceAll(args[2],args[3]);
                output.println(s2);
            }
        }

    }
}

/*
File inFile=new File(args[0]);
StringBuilder sb=new StringBuilder();
try(
Scanner input=new Scanner(inFile);
 )
 {
while(input.hasNext())
{
String s1=input.nextLine();
String s2=s1.replaceAll(args[1],args[2]);
sb.append(s2+"\n");
}
 }
 try(
 PrintWriter output-new PrintWriter(args[0]);
 )
 {
 output.println(sb);
 }
 }
 */
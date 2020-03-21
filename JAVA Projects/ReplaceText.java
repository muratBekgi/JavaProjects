import java.io.*;

public class ReplaceText {
    public static void main(String [] args)throws Exception{
        if(args.length!=4){
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File sourFile=new File(args[0]);
        if(!sourFile.exists()){
            System.out.println("Source File "+args[0]+" does not exist");
            System.exit(2);
        }

        File targetFile= new File(args[1]);
            if(targetFile.exists()){
                System.out.println("Target file "+args[1]+" alrady exists");
                System.exit(3);
            }

            try(
                    java.util.Scanner input=new java.util.Scanner(sourFile);
                    PrintWriter output=new PrintWriter(targetFile);
                    ){
                while(input.hasNext()){
                    String s1=input.nextLine();
                    String s2=s1.replaceAll(args[2],args[3]);
                    output.print(s2);
                }
            }



    }
}

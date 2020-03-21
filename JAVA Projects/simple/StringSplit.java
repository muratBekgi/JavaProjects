public class StringSplit {
    public static void main(String [] args){

       java.util.Scanner input=new java.util.Scanner("s1; s2 s3; s4").useDelimiter("\\s*; \\s*");

       while(input.hasNext()){
           System.out.print(input.next()+",");
       }
       input.close();


    }
}

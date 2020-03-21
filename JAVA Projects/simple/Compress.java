import java.util.*;

public class Compress {


    public static void main(String [] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a String");
        String  str=sc.nextLine();
        String temp="";

        List<Character> arrlist = new ArrayList<Character>();
        for(int i=0; i<str.length();i++){
            arrlist.add(str.charAt(i));
        }
        for(int i=0; i<str.length();i++){
            int freq = Collections.frequency(arrlist,str.charAt(i));


            System.out.print(str.charAt(i)+""+ freq);
        }
    }
}
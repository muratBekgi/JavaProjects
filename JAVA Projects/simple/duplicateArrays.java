import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class duplicateArrays {
    public static void main(String [] args){

        ArrayList<Integer> num= new ArrayList<>();
        Collections.addAll(num,1,2,3,4,5,5);

        HashSet<Integer> hs=new HashSet<>(num);
        System.out.println(hs);



    }
}

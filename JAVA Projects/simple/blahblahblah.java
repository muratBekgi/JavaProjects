
public class blahblahblah {
    public static void main(String [] args) {


        String str="abdc";
        dupEachChar2(str);
        //System.out.println(dupEachChar2(str));


        String a = "abcd";
        String b = a.replaceAll("(.)", "$1$1$1");
       // b is now equals to aabbcc
        System.out.println(b);
    }

     public static String dupEachChar2(String str) {

        if(str.length() == 1)
            return str + str;
        else
            return str.substring(0,1)+str.substring(0,1)+dupEachChar2(str.substring(1));
    }

}
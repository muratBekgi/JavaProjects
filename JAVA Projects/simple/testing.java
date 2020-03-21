public class testing {
    public static void main(String [] args){

        String str="abc";


        for (int i = 0; i < str.length(); i++) {
            System.out.print((str.substring(i,i+1)+str.substring(i,i+1))+"");
        }
    }
}

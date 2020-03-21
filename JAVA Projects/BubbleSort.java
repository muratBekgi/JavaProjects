public class BubbleSort {
    public static void main(String [] args){

        int [] list={1,9,7,5,-4};
        boolean needNextPass=true;

        for (int k = 1; k <list.length ; k++) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i+1]) {

                    int temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;

                    needNextPass=true;
                }
            }

        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " ");

        }
    }
}

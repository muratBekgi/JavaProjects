public class BuubleSort_SelfExercise {
    public static void main(String []args){

        double list[] ={21.3,66.9,9,-55.6,1,5,6,7};
        boolean next=true;

        for (int i = 1; i <list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {

                if(list[j]>list[j+1]){

                    double temp=list[j+1];
                    list[j]=list[j+1];
                    list[j+1]=temp;

                    next=true;
                }
            }

        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }
}

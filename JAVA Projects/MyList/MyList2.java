import java.util.*;

public class MyList2 <T extends Comparable<T>> {
    ArrayList<T> list = new ArrayList<T>();

    public void add(T add) {
        list.add(add);
    }

    public T largest(){
        if(list.size()>0){
            int largestNum=0;
            for (int i = 1; i <list.size() ; i++) {
                if(list.get(i).compareTo(list.get(largestNum))>0)
                largestNum=i;
            }
            return list.get(largestNum);
        }
        return null;
    }

    public T smallest(){
        if(list.size()>0){
            int smallestNum=0;
            for (int i = 0; i <list.size() ; i++) {
                if(list.get(i).compareTo(list.get(smallestNum))<0)
                smallestNum=i;
            }
            return list.get(smallestNum);
        }
        return null;
    }

    public static void main(String [] args){

        MyList2<Integer> integerMyList2=new MyList2<>();
        Random randomNum=new Random();
        System.out.print("Numbers are: ");
        for (int i = 1; i < 6; i++) {
            int value=5+randomNum.nextInt(1000);
            integerMyList2.add(value);
            System.out.print(value+", ");
        }
        System.out.println("\nLargest number:  " + integerMyList2.largest());
        System.out.println("Smallest number: " + integerMyList2.smallest());
        System.out.println("-------------------------------------\n");



        MyList2<String> stringMyList2=new MyList2<>();
        String [] names = {"Murat","Nazar","Oraz","Mustafa","Tylla"};
        System.out.print("Names are: ");
        for (String name : names) {
            stringMyList2.add(name);
            System.out.print(name + ", ");
        }
        System.out.println("\nLargest String:   "+stringMyList2.largest());
        System.out.println("Smallest String : "+stringMyList2.smallest());
        System.out.println("-----------------------------------------------");


    }

}

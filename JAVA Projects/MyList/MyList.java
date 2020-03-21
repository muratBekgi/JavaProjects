import java.util.*;

public class MyList<T extends Number> {
    ArrayList<T> list = new ArrayList<T>();

    public void add(T add) {
        list.add(add);
    }
    public T largest() {
        T largestNum = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() > largestNum.doubleValue()) {
                largestNum = list.get(i);
            }
        }
        return largestNum;
    }
    public T smallest() {
        T smallestNum = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() < smallestNum.doubleValue()) {
                smallestNum = list.get(i);
            }
        }
        return smallestNum;
    }

    public static void main(String[] args) {

        MyList<Integer> numbers = new MyList<Integer>();

        Random randomNum=new Random();
        System.out.print("Numbers are: ");
        for (int i = 0; i < 6; i++) {
            int value=5+randomNum.nextInt(1000);
            numbers.add(value);
            System.out.print(value+", ");
        }

        System.out.println("\nLargest num:  " + numbers.largest());
        System.out.println("Smallest num: " + numbers.smallest());
    }

}

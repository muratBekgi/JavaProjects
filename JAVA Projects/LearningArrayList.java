import java.util.ArrayList;
import java.util.Collections;

public class LearningArrayList {
    public static void main(String [] args){

       ArrayList<String> cars=new ArrayList<String>();
       //The ArrayList class has many useful methods. For example, to add elements
        // to the ArrayList, use the add() method:
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //To access an element in the ArrayList, use the get() method,
        // and refer to the index number:
        System.out.println(cars.get(0));

        //To modify an element, use the set() method,
        // and refer to the index number:
        cars.set(0,"Lexus");
        System.out.println(cars);

        //To remove an element, use the remove() method,
        // and refer to the index number:
        cars.remove(0);
        System.out.println(cars);


        //To find out how many elements an ArrayList have,
        // use the size method:
        System.out.println(cars.size());


        //To remove all the elements in the ArrayList,
        // use the clear() method:
        cars.clear();
        System.out.println(cars);


        //Loop through the elements of an ArrayList with a for loop,
        // and use the size() method to specify how many times the loop should run:
        ArrayList<String> computeres=new ArrayList<String>();
        computeres.add("Macbook");
        computeres.add("Asus");
        computeres.add("Dell");
        computeres.add("Sony");
        for(int i=0; i<computeres.size();i++){
            System.out.print(computeres.get(i)+" ");
        }

        //You can also loop through an ArrayList with the for-each loop:
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("\nWhite");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        for(String i:colors){
            System.out.print(i+" ");
        }
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        System.out.println();
        for(Integer i:num){
            System.out.print(i+" ");
        }

        //Another useful class in the java.util package is the Collections class,
        //which include the sort() method for sorting lists alphabetically or numerically:
        System.out.println();
        ArrayList<String> cars2=new ArrayList<String>();
        cars2.add("Ferrari");
        cars2.add("Bugatti");
        cars2.add("Lamborgini");
        cars2.add("McLaren");

        Collections.sort(cars2);        //sort cars
        for(String i: cars2){
            System.out.print(i+" ");
        }

        //Sort an ArrayList of Integers:
        System.out.println();
        ArrayList<Integer> num2=new ArrayList<Integer>();
        num2.add(100);
        num2.add(-55);
        num2.add(403);
        num2.add(25);

        Collections.sort(num2);
        for(Integer i: num2){
            System.out.print(i+" ");
        }

    }
}

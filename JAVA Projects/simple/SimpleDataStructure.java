import java.util.Arrays;

class SimpleDataStructure {

    public String[] addSort(String moreFriends []) {

        for (int i = 0; i < moreFriends.length; i++)
            Arrays.sort(moreFriends);
        return moreFriends;
    }

    public static void main(String[] arg) {

        SimpleDataStructure sortedFriends = new SimpleDataStructure();
        String [] name ={"Kalle", "Bob","Carl","Alice", "Lewis"};


        System.out.println("Unsorted:");
        System.out.println(Arrays.toString(name));

        System.out.println("Sorted:");
        System.out.println(Arrays.toString(sortedFriends.addSort(name)));
    }
}

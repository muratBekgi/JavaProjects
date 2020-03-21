import java.util.*;
import java.text.DecimalFormat;

/*
 *  Driver2 class
 */
public class Driver2 {

    // Helper method to swap values in array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static long bstHeightsTotal = 0l;
    static long rbtHeightsTotal = 0l;
    static long count = 0;

    // Helper method to permute array at indices
    private static void permute(int[] array, int l, int r) {
        if (l == r) {
            BST bst = new BST();
            for (int value: array) {
                bst.insert(value);
            }
            bstHeightsTotal += bst.height();
            RBT rbt = new RBT();
            for (int value: array) {
                rbt.insert(value);
            }
            rbtHeightsTotal += rbt.height();
            count++;
        } else {
            for (int i = l; i <= r; i++) {
                swap(array, l, i);
                permute(array, l+1, r);
                swap(array, l, i);
            }
        }
    }

    // Helper method to create permutations
    private static void testPermutations(int n) {
        bstHeightsTotal = 0;
        rbtHeightsTotal = 0;
        count = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = i+1;
        permute(array, 0, n-1);
    }

    // Main method for program execution
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Project 2: Average Heights");
        System.out.println("Enter a value for n");
        System.out.print(">");
        int n = Integer.parseInt(s.nextLine());
        testPermutations(n);
        double bstAverageHeight = bstHeightsTotal * 1.0 / count;
        double rbtAverageHeight = rbtHeightsTotal * 1.0 / count;
        DecimalFormat df = new DecimalFormat("#.####");
        if (n == 1) {
            System.out.printf("The average height of a BST with " + n + " node is " + df.format(bstAverageHeight) + ". \n");
            System.out.printf("The average height of a RBT with " + n + " node is " + df.format(rbtAverageHeight) + ".\n");
        } else {
            System.out.printf("The average height of a BST with " + n + " nodes is " + df.format(bstAverageHeight) + ". \n");
            System.out.printf("The average height of a RBT with " + n + " nodes is " + df.format(rbtAverageHeight) + ".\n");
        }
    }

}
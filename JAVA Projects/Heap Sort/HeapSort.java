import java.util.*;
public class HeapSort<T> {

    protected Comparator<T> c;
    @SuppressWarnings("unchecked")
    public HeapSort() {
        this.c = (e1, e2) -> ((Comparable<T>)e1).compareTo(e2);

    }

    /** Create a BST with a specified comparator */
    public HeapSort(Comparator<T> c) {
        this.c = c;

    }

    public   void sort(T[] anArray) {
        for(int index = anArray.length-1; index >=0; --index) {
            heapRebuild(anArray,index,anArray.length);

        }
        heapSort(anArray);
    }


    private void heapRebuild(T[] anArray, int root, int n) {
        // Left as an exercise

        int child ;
        if ((2*root+1) <= n || (2*root+2) <= n) {           //If the root is not a leaf
            child = root * 2 + 1;                           //Index for left child
            if ((2 * root + 2) <= n) {
                int rightChild = child + 1;                 //Index for right child
                if ((rightChild < n) && c.compare(anArray[rightChild], anArray[child]) > 0) {
                    child = rightChild;
                }

                //If the root value is less than the child value
                if (c.compare(anArray[root], anArray[child]) < 0) {
                    T temp = anArray[root];
                    anArray[root] = anArray[child];
                    anArray[child] = temp;
                    heapRebuild(anArray, child, n);
                }
            }
        }


    }

    private void heapSort(T[] anArray) {
        // Left as an exercise

        int n=anArray.length;
        for (int i = n-1; i >= 0; i--)
            heapRebuild(anArray,i,n-1);

        int last = n-1;
        for (int i = 1; i <= n; i++) {
            T temp = anArray[0];
            anArray[0] = anArray[last];
            anArray[last] = temp;
            last--;
            heapRebuild(anArray,0,last);
        }

    }

}




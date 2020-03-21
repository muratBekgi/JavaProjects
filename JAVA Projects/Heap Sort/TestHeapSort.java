public class TestHeapSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer[] list = {-5,-44, -3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        HeapSort<Integer> hs = new HeapSort<>();

        hs.sort(list);

        for(int i=0; i<list.length;i++) {
            System.out.print(list[i]+" ");

        } // end for
    } // end main

} // end TestHeapSort


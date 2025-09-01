import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTraversalTest {
    public static void main(String[] args) {

        // My Test with 50K numbers

        System.out.println("Testing with 50K num:\n\n");
        runTest(50000);

        // 500K test
        System.out.println("Testing with 500k numbers:\n\n");
        runTest(500000);


    }

    public static void runTest(int size) {
        LinkedList<Integer> list = new LinkedList<>();



        // This function will append the numbers to the array
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long start = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();\


        while (iterator.hasNext()) {
            iterator.next();
        }


        long end = System.nanoTime();

        System.out.println("Iterator traversal time: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        end = System.nanoTime();
        System.out.println("get(index) traversal time: " + (end - start) / 1_000_000.0 + " ms");

    }
}

/*
Results Discussion:
- I found that using an iterator is faster and more efficient that using the get(index)
*/

package challenges.arrays;

import java.util.*;

public class KthLargestValue {

    private static int getMax(Integer[] input, int k) {
        List<Integer> list = Arrays.asList(input);
        Set<Integer> set = new TreeSet<>(list);

        list = new ArrayList<>(set);
        int value = list.size() - k;

        return list.get(value);
    }

    private static Integer getMaxUsingMinHeap(Integer[] input, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k+1);
        int i = 0;
        while (i<=k) {
            queue.add(input[i]);
            i++;
        }
        for (; i<input.length; i++) {
            Integer value = queue.peek();
            if (input[i] > value) {
                queue.poll();
                queue.add(input[i]);
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{12, 15, 15, 23, 54, 11, 6};
        int index = 4;
        System.out.println("The " + index + " largest value is " + getMaxUsingMinHeap(arr, 4));
    }
}

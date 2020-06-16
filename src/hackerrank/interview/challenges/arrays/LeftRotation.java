package hackerrank.interview.challenges.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

    // My original solution
    static int[] rotLeft(int[] a, int d) {
        for (int i = 0; i < d; i++) {
            int last = a[a.length - 1];
            int temp1 = 0;
            int temp2 = 0;
            for (int j = 0; j < a.length; j++) {
                if (j+1 < a.length) {
                    temp1 = a[j+1];
                    temp2 = a[j];
                    a[j+1] = temp2;

                } else {
                    a[j] = last;
                }
            }
        }
        return a;
    }

    static int[] rotLeftEfficient(int[] a, int d) {
        for (int i = 0; i < d; i++){
            int temp=a[0];
            for (int j = 1; j < a.length; j++){
                a[j-1] = a[j];
            }
            a[a.length - 1] = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] result = rotLeftEfficient(new int[]{1, 2, 3, 4, 5}, 3);
        for (int num: result) System.out.println(num);
    }
}

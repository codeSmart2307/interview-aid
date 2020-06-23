package hackerrank.misc;

import java.io.*;
import java.util.*;

public class JumpingOnClouds {

    // My original solution
    static int jumpingOnClouds(int[] c) {
        int minJumpsRequired = 0;
        int count = 0;
        while (count < c.length) {
            if (c[count] == 0) {
                if (count + 2 < c.length && c[count + 2] == 0) {
                    count+=2;
                    minJumpsRequired++;
                } else if (count + 1 < c.length && c[count + 1] == 0) {
                    count++;
                    minJumpsRequired++;
                } else {
                    count++;
                }
            } else {
                count++;
            }
        }
        return minJumpsRequired;
    }

    // More efficient solution
    static int jumpingOnCloudsEfficient(int[] c) {
        int count = -1;
        int n = c.length;
        for (int i = 0; i < n; i++, count++) {
            if (i < n-2 && c[i+2] == 0) i++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        int result = jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0});
        System.out.println("Minimum number of jumps required: " + result);
    }
}

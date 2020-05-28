package hackerrank.interview.challenges;

import java.io.*;
import java.util.*;

public class SockMerchant {

    // My original solution
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && ar[i] >= 1 && ar[i] <= 100 && ar[j] >= 1 && ar[j] <= 100) {
                        if (ar[i] == ar[j]) {
                            pairs++;
                            ar[i] = -99;
                            ar[j] = -99;
                            break;
                        }
                    }
                }
            }
        }
        return pairs;
    }

    // More efficient solution
    static int sockMerchantEfficient(int n, int[] ar) {
        int pairs = 0;
        // Sets cannot contain duplicate values
        HashSet<Integer> socks = new HashSet<Integer>();
        for (int sock: ar) {
            if (!socks.add(sock)) {
                pairs++;
                socks.remove(sock);
            }
        }
        return pairs;
    }

    public static void main(String[] args) throws IOException {
        int result = sockMerchantEfficient(7, new int[]{10, 20, 10, 20, 10, 30, 10});

        System.out.println(result);
    }
}

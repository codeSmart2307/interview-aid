package hackerrank.interview.challenges;

import java.util.Collections;

public class RepeatedString {

    // My original solution
    static long repeatedString(String s, long n) {
        int strLength = s.length();
        long aCount = 0;
        long factor = n / strLength;
        long remainder = n % strLength;
        for (int i=0; i < strLength; i++) {
            if (s.charAt(i) == 'a') {
                aCount += (i < remainder) ? factor + 1 : factor;
            }
        }
        return aCount;
    }

    // More efficient solution
    static long repeatedStringEfficient(String s, long n) {
        return 0;
    }

    public static void main(String[] args) {
        long result = repeatedString("abca", 1000000000000L);
        System.out.println("Count: " + result);
    }
}

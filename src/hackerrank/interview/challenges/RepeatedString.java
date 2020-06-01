package hackerrank.interview.challenges;

import java.util.Collections;

public class RepeatedString {

    // My original solution
    static long repeatedString(String s, long n) {
        int stringLen = s.length();
        String finalRepeatedString;
        if (stringLen < n) {
            long timesToRepeat = n/stringLen;
            String fullStringRepeated = String.join("", Collections.nCopies(Math.toIntExact(timesToRepeat), s));
            int nRemainder = (int)n - fullStringRepeated.length();
            finalRepeatedString = fullStringRepeated + s.substring(0, Math.min(stringLen, nRemainder));
        } else if (stringLen > n) {
            finalRepeatedString = s.substring(0, Math.min(stringLen, (int)n));
        } else {
            finalRepeatedString = s;
        }

        int aCount = 0;
        for (char character: finalRepeatedString.toCharArray()) {
            if (character == 'a') {
                aCount++;
            }
        }

        return (long)aCount;
    }

    // More efficient solution
    static long repeatedStringEfficient(String s, long n) {
        return 0;
    }

    public static void main(String[] args) {
        long result = repeatedString("a", 1000000000000L);
        System.out.println("Count: " + result);
    }
}

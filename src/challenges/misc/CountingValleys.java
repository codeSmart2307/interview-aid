package challenges.misc;

public class CountingValleys {

    // My origjnal solution
    static int countingValleys(int n, String s) {
        // Position 0 is sea level
        int position = 0;
        int valleyCount = 0;
        boolean isSeaLevelReached = true;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                position--;
                if (position < 0 && s.charAt(i + 1) == 'U' && isSeaLevelReached) {
                    System.out.println("This is a valley");
                    valleyCount++;
                    isSeaLevelReached = false;
                }
            } else position++;
            if (position == 0) isSeaLevelReached = true;
            System.out.println("Current position: " + position);
        }
        return valleyCount;
    }

    // More efficient solution
    static int countingValleysEfficient(int n, String s) {
        int level = 0;
        int valleyCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                level++;
            } else if (s.charAt(i) == 'D') {
                if(level == 0) {
                    valleyCount++;
                }
                level--;
            }
        }
        return valleyCount;
    }

    public static void main(String[] args) {
        int result = countingValleys(12, "DDUUDDUDUUUD");
        System.out.println("Number of valleys: " + result);
    }
}

package hackerrank.interview.challenges.arrays;

public class HourglassSum {

    // My original solution
    static int hourglassSum(int[][] arr) {
        int maxSum = -9999;
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr[i].length; j++) {
                if (i+2 < arr.length && j+2 < arr[i].length) {
                    int hourglassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                            arr[i+1][j+1] +
                            arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                    if (hourglassSum > maxSum) maxSum = hourglassSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 6, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int result = hourglassSum(arr);
        System.out.println("Highest sum: " + result);
    }
}

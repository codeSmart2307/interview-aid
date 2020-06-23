package data_structures;

public class Array {

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The element at index " + i + " is: " + arr[i]);
        }
    }

    // Function that reverses array and stores it in another array
    static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // Print reversed array
        System.out.println("Reversed array is:");
        printArr(b);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        printArr(arr);

        reverse(arr, arr.length);
    }
}

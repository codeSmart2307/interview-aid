package algorithms.sorting;

// Java program for implementation of Bubble Sort
class BubbleSort {
    static void sort(int[] arr) {
        int n = arr.length;
        int temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sort(arr);
        for (int value : arr) System.out.print(value + " ");
    }
}

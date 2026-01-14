package dsa.searchAlgorithms;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop = number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop = compare neighbors
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 8, 4, 2};

        bubbleSort(data);

        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}


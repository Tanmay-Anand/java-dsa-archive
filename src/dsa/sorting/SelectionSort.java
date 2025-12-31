package dsa.sorting;

public class SelectionSort {

    public void meth(int n, int[] arr) {
        for (int i = 0; i <= n - 2; i++) {
            int mini = i;

            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            swap(arr, i, mini);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 50, 30};
        int n = arr.length;

        SelectionSort ss = new SelectionSort();
        ss.meth(n, arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

package dsa.sorting;

public class BubbleSort2 {

    public void meth(int n, int[] arr) {
        for (int i = n - 1; i >= 1; i--) {
            int didSwap = 0;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    didSwap = 1;
                }
            }

            if (didSwap == 0) {
                break;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        BubbleSort2 bs2 = new BubbleSort2();
        bs2.meth(arr.length, arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

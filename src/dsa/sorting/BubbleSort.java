package dsa.sorting;

public class BubbleSort {

    public void meth(int n, int[] arr) {
        for(int i=n-1; i>=1;i--)
        {
            for(int j=0; j<=i-1; j++)
            {
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
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

        BubbleSort bs = new BubbleSort();
        bs.meth(n, arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

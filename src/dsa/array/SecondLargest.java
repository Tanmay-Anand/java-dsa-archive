package dsa.array;

import java.util.Arrays;

public class SecondLargest {

    public void meth(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        Arrays.sort(arr);

        int n = arr.length;
        int largest = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                System.out.println("Second largest element: " + arr[i]);
                return;
            }
        }

        System.out.println("No second largest element (all values same)");
    }

    public static void main(String[] args) {
        SecondLargest sl = new SecondLargest();
        int[] arr = {20, 10, 50, 80, 100};
        sl.meth(arr);
    }
}

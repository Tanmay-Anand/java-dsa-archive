package dsa.sorting;

import java.util.Arrays;

public class SubarraySort {

    public static void main(String[] args)
    {

        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sort subarray from index 1 to 4
        Arrays.sort(arr, 1, 5);

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}
package dsa.array;

import java.util.*;

class LongestSubarray {

    public int getLongestSubarray(int[] a, int k) {
        int n = a.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += a[j];

                if (sum == k) {

                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1 };
        int k = 1;

        LongestSubarray solver = new LongestSubarray();
        int len = solver.getLongestSubarray(a, k);

        System.out.println("The length of the longest sub-array is: " + len);
    }
}


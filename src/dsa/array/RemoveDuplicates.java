package dsa.array;

import java.util.HashMap;

public class RemoveDuplicates {
        static void remove(int[] a, int n)
        {

            HashMap<Integer, Boolean> hm = new HashMap<>();

            for (int i = 0; i < n; i++) {

                if (hm.get(a[i]) == null)
                {
                    System.out.print(a[i] + " ");
                    hm.put(a[i], true);
                }
            }
        }

        public static void main(String[] args)
        {
            int[] arr = { 1, 2, 3, 1, 4, 2, 1, 5 };

            int n = arr.length;
            remove(arr, n);
        }
}

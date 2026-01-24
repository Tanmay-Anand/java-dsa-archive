package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class ReverseArray_Hashing {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] revArr = new int[arr.length];

        Map<Integer, Integer> map = new HashMap<>();

        // store in map
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }

        // read in reverse
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[index++] = map.get(i);
        }

        // Print result
        for (int num : revArr) {
            System.out.print(num + " ");
        }
    }
}

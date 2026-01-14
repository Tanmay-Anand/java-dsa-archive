package dsa.array;

import java.util.*;

class MajorityElement_Hashing {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        MajorityElement_Hashing sol = new MajorityElement_Hashing();

        int ans = sol.majorityElement(arr);

        System.out.println("The majority element is: " + ans);
    }
}
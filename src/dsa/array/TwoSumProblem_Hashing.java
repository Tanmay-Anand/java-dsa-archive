package dsa.array;

import java.util.HashSet;
import java.util.Set;

public class TwoSumProblem_Hashing {
    public boolean verify(int[] arr, int target)
    {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                return true;
            }

            seen.add(num);
        }
        return false;

    }

    public static void main(String[] args) {
        TwoSumProblem_Hashing tsph = new TwoSumProblem_Hashing();

        int[] arr= {2,6,5,8,11};
        int target = 14;

        System.out.println(tsph.verify(arr, target));
    }
}

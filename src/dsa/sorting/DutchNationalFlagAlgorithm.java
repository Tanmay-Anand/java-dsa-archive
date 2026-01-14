package dsa.sorting;
//sort array containing 0s, 1s, and 2s using Dutch National Flag Algorithm
import java.util.*;

class DutchNationalFlagAlgorithm {

    public void sortZeroOneTwo(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        DutchNationalFlagAlgorithm dnfa = new DutchNationalFlagAlgorithm();
        int[] nums = {2, 0, 2, 1, 1, 0};

        dnfa.sortZeroOneTwo(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

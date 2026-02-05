package dsa.array;

public class SubArraySum {

    public static boolean hasSubArrayWithSum(int[] arr, int targetSum) {
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == targetSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        System.out.println(hasSubArrayWithSum(arr, targetSum));
    }
}

package dsa.array;

public class LargestAndSmallest {

    public static int[] findLargestAndSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return new int[]{largest, smallest};
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 4, 5, 8, 6, 3};

        int[] result = findLargestAndSmallest(arr);

        System.out.println("Largest : " + result[0]);
        System.out.println("Smallest : " + result[1]);
    }
}

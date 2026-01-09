package dsa.array;

public class MissingNumber {

    public int findNumber(int[] arr) {
        int expected = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != expected) {
                return expected;
            }
            expected++;
        }

        // If nothing was missing inside the loop,
        // then the missing number is the next one
        return expected;
    }

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] arr = {1, 2, 4, 5, 6};

        int num = mn.findNumber(arr);
        System.out.println("The missing number is: " + num);
    }
}

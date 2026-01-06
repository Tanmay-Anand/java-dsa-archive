package dsa.array;

public class LeftRotateArr {

    static void leftRotateByOne(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 2, 1, 5 };

        leftRotateByOne(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
